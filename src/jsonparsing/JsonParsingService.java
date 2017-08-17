package jsonparsing;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import javax.lang.model.util.Elements;
import java.util.ArrayList;

/**
 * Created by danawacomputer on 2017-07-18.
 */
public class JsonParsingService {
    public static ArrayList<String[]> parseXML(String data) {

        ArrayList<String[]> result = new ArrayList<String[]>();
        Document doc = Jsoup.parse(data);
        org.jsoup.select.Elements items = doc.getElementsByTag("stnko");
        for(Element item : items) {
            String[] nodes = {item.nodeName(), item.text()};
            result.add(nodes);
        }

        return result;
    }
}
