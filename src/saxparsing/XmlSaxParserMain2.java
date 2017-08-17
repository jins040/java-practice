package saxparsing;

public class XmlSaxParserMain2 {
    public static void main(String[] args) {
        XMLSAXParser2 parser = new XMLSAXParser2("src\\saxparsing\\test.xml");

        try {
            parser.parse();

            System.out.println("x = " + parser.getX());
            System.out.println("y = " + parser.getY());
        } catch(Exception e) {
            System.out.println("parser.parse() Exception >> " + e.toString());
        }
    }
}