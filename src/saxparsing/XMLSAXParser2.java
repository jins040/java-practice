package saxparsing;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class XMLSAXParser2 extends DefaultHandler {

    // SAXParserFactory     
    private SAXParserFactory parserFactory;

    // SAXParser     
    private SAXParser parser;

    // xml 파일 명    
    private String fileName;

    // 시작 태그명
    private String startTagName;

    // 끝 태그명
    private String endTagName;

    // String buffer
    private StringBuffer buffer = new StringBuffer();

    // 추출 값 x,y
    private String x;
    private String y;

    // 생성자
    public XMLSAXParser2() {}

    public XMLSAXParser2(String fileName) {
        super();
        try {
            parserFactory = SAXParserFactory.newInstance();
            parser = parserFactory.newSAXParser();
        } catch(Exception e) {
            System.out.println("Exception >> " + e.toString());
        }

        this.fileName = fileName;
    }

    // 문서의 시작
    public void startDocument(){
        //System.out.println("start document!!");
    }

    // 문서의 종료
    public void endDocument(){
        //System.out.println("end document!!");
    }

    // 시작 태그 인식했을 때 처리
    public void startElement(String url, String name, String elementName, Attributes attrs)
            throws SAXException {
        startTagName = elementName;
        //reset
        buffer.setLength(0);
    }

    // 시작태그와 끝태그 사이의 내용을 인식 했을 때 처리
    public void characters(char[] str, int start, int len) throws SAXException {
        buffer.append(str, start, len);

        // 태그명 중 'x' 와 'y'값만 추출해서 변수에 담는다.
        if(this.startTagName.equals("x")){
            this.x = buffer.toString().trim();
        }
        if(this.startTagName.equals("y")){
            this.y = buffer.toString().trim();
        }
    }

    // 끝태그를 인식 했을 때 처리
    public void endElement(String url, String localName, String name) {
        endTagName = name;
    }

    // parse
    public void parse() {
        try {
            parser.parse(fileName, this);

        } catch(Exception e) {
            System.out.println("XMLSAXParser Exception " + e.toString());
        }
    }

    // 추출 값 가져오기
    public String getX() {
        return x;
    }

    public String getY() {
        return y;
    }

}