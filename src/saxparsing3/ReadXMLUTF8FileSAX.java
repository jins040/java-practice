package saxparsing3;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ReadXMLUTF8FileSAX {
    public static void main( String[] args ) {

        List<Weather> weatherList = new ArrayList<>();
        System.out.println("선언시점");

        try {

            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            DefaultHandler handler = new DefaultHandler() {

                boolean bstnko = false;
                boolean bavgtamax = false;
                boolean bavgtamin = false;
                boolean btaavg = false;

                private String tempString;
                Weather weather = new Weather();

                public void startElement(
                        String uri, String localName, String qName, Attributes attributes) throws SAXException {

                    System.out.println("Start Element :" + qName);

                    if (qName.equalsIgnoreCase("STNKO")) {
                        bstnko = true;
                    }

                    if (qName.equalsIgnoreCase("AVGTAMAX")) {
                        bavgtamax = true;
                    }

                    if (qName.equalsIgnoreCase("AVGTAMIN")) {
                        bavgtamin = true;
                    }

                    if (qName.equalsIgnoreCase("TAAVG")) {
                        btaavg = true;
                    }


                }

                public void endElement(String uri, String localName, String qName) throws SAXException {

                    System.out.println("End Element :" + qName);

                }

                public void characters(char ch[], int start, int length) throws SAXException {

                    //System.out.println(new String(ch, start, length));

                    tempString = new String(ch, start, length).trim();
                    //System.out.println(tempString + "check.. ");

                    if (bstnko) {
                        System.out.println("지역명 : " + tempString);
                        weather.setAreaName(tempString);
                        System.out.println("data inputted..");
                        System.out.println(weather);
                        bstnko = false;
                    }

                    if (bavgtamax) {
                        System.out.println("기온 평균 최고 : " + tempString);
                        //System.out.println(bavgtamax);
                        if (tempString.equals("")) {
                            bavgtamax = true;
                            //System.out.println(bavgtamax + "\t check boolean..");
                        } else {
                            weather.setMaxAvgTemp(tempString);
                            System.out.println("data inputted..");
                            System.out.println(weather);
                            bavgtamax = false;
                            //System.out.println(bavgtamax + "\t check boolean..");
                        }
                    }

                    if (bavgtamin) {
                        System.out.println("기온 평균 최소 : " + new String(ch, start, length));
                        bavgtamin = false;
                    }

                    if (btaavg) {
                        System.out.println("기온 평균 : " + tempString);
                        if (tempString.equals("")) {
                            btaavg = true;
                        } else {
                            weather.setAvgTemp(tempString);
                            System.out.println("data inputted..");
                            System.out.println("2"+weatherList);
                            System.out.println("1"+weather);
                            weatherList.add(weather);
                            System.out.println("2"+weatherList);
                            btaavg = false;
                        }
                    }

                }

            };

            File file = new File("src\\saxparsing3\\sample.xml");
            InputStream inputStream= new FileInputStream(file);
            Reader reader = new InputStreamReader(inputStream,"UTF-8");

            InputSource is = new InputSource(reader);
            is.setEncoding("UTF-8");

            saxParser.parse(is, handler);
            System.out.println(weatherList);

//            for (Weather e : weatherList) {
//                System.out.println(e);
//            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}