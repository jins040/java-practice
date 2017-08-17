package saxparsing;

/**
 * Created by danawacomputer on 2017-07-21.
 */
public class XMLParsingWithSax {
    public static void main(String[] args) {
        XMLSAXParser parser = new XMLSAXParser("src\\saxparsing\\sample.xml");

        try {
            parser.parse();

            System.out.println(parser.getStnko());
            System.out.println(parser.getAvgtamax());
            System.out.println(parser.getAvgtamin());
            System.out.println(parser.getTaavg());
            System.out.println(parser.getAvghm());

        } catch (Exception e) {
            System.out.println("parser.parse() Exception >>" + e.toString());
        }
    }//main
}
