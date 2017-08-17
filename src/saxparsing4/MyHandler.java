/**
 * Created by danawacomputer on 2017-07-31.
 */
package saxparsing4;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class MyHandler extends DefaultHandler {

    private List<Weather> weatherList = null;
    private Weather weather = null;

    public List<Weather> getWeatherList() {
        return weatherList;
    }

    private boolean bstnko = false;
    private boolean bavgtamax = false;
    private boolean bavgtamin = false;
    private boolean btaavg = false;

    private String tempString;

    @Override
    public void startElement(
            String uri, String localName, String qName, Attributes attributes) throws SAXException {

        System.out.println("Start Element :" + qName);

        if (qName.equalsIgnoreCase("info")) {
            weather = new Weather();
            if (weatherList == null) {
                weatherList = new ArrayList<>();
            }
        } else if (qName.equalsIgnoreCase("STNKO")) {
            bstnko = true;
        } else if (qName.equalsIgnoreCase("AVGTAMAX")) {
            bavgtamax = true;
        } else if (qName.equalsIgnoreCase("AVGTAMIN")) {
            bavgtamin = true;
        } else if (qName.equalsIgnoreCase("TAAVG")) {
            btaavg = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {

        System.out.println("End Element :" + qName);

        if (qName.equalsIgnoreCase("/info")) {
            weatherList.add(weather);
        }
    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException {

        //System.out.println(new String(ch, start, length));

        tempString = new String(ch, start, length).trim();
        //System.out.println(tempString + "check.. ");

        if (bstnko) {
            System.out.println("지역명 : " + tempString);
            weather.setAreaName(tempString);
            //System.out.println("data inputted..");
            //System.out.println(weather);
            bstnko = false;
        } else if (bavgtamax) {
            System.out.println("기온 평균 최고 : " + tempString);
            //System.out.println(bavgtamax);
            if (tempString.equals("")) {
                bavgtamax = true;
                //System.out.println(bavgtamax + "\t check boolean..");
            } else {
                weather.setMaxAvgTemp(tempString);
                //System.out.println("data inputted..");
                System.out.println(weather);
                bavgtamax = false;
                //System.out.println(bavgtamax + "\t check boolean..");
            }
        } else if (bavgtamin) {
            System.out.println("기온 평균 최소 : " + tempString);
            if (tempString.equals("")) {
                bavgtamin = true;
                //System.out.println(bavgtamax + "\t check boolean..");
            } else {
                weather.setMinAvgTemp(tempString);
                //System.out.println("data inputted..");
                System.out.println(weather);
                bavgtamin = false;
                //System.out.println(bavgtamax + "\t check boolean..");
            }
        } else if (btaavg) {
            System.out.println("기온 평균 : " + tempString);
            if (tempString.equals("")) {
                btaavg = true;
            } else {
                weather.setAvgTemp(tempString);
                //System.out.println("data inputted..");
                System.out.println("2"+weatherList);
                System.out.println("1"+weather);
                weatherList.add(weather);
                System.out.println("2"+weatherList);
                btaavg = false;
            }
        }
    }

}
