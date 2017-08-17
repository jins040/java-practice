/**
 * Created by danawacomputer on 2017-07-31.
 */

package saxparsing4;

import org.xml.sax.InputSource;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.*;

public class XMLParserSAX {
    public static void main(String[] args) {

        SAXParserFactory factory = SAXParserFactory.newInstance();

        try {
            SAXParser saxParser = factory.newSAXParser();

            MyHandler handler = new MyHandler();

            File file = new File("src\\saxparsing4\\sample.xml");

            InputStream inputStream= new FileInputStream(file);
            Reader reader = new InputStreamReader(inputStream,"UTF-8");

            InputSource is = new InputSource(reader);
            is.setEncoding("UTF-8");

            saxParser.parse(is, handler);
            System.out.println(handler.getWeatherList());

            for (Weather e : handler.getWeatherList()) {
                System.out.println(e);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//main
}
