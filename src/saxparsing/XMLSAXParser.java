package saxparsing;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

/**
 * Created by danawacomputer on 2017-07-21.
 */
public class XMLSAXParser extends DefaultHandler {
    private SAXParserFactory parserFactory;

    private SAXParser parser;

    private String fileName;    // xml 파일 명

    private String startTagName;    // 시작 태그명

    private String endTagName;      // 끝 태그명

    private StringBuffer buffer = new StringBuffer();

    // 추출 값 목록
    private String stnko;
    private String avgtamax;
    private String avgtamin;
    private String taavg;
    private String avghm;

    // 생성자
    public XMLSAXParser() {}
    public XMLSAXParser(String fileName) {
        super();
        try {
            parserFactory = SAXParserFactory.newInstance();
            parser = parserFactory.newSAXParser();
        } catch (Exception e) {
            System.out.println("Exception >>" + e.toString());
        }

        this.fileName = fileName;
    }

    // 문서의 시작
    public void startDocument() {
        System.out.println("start document");
    }
    // 문서의 종료
    public void endDocument() {
        System.out.println("end document");
    }

    // 시작 태그 인식했을 때 처리
    public void startElmement(String url, String name, String elementName, Attributes attrs) throws SAXException {
        startTagName = elementName;
        //reset
        buffer.setLength(0);
    }

    // 시작 태그와 끝 태그 사이의 내용을 인식 했을 때 처리
    public void characters(char[] str, int start, int len) throws SAXException {
        buffer.append(str, start,len);

        //xml 태그명 중 추출하고자 하는 값을 변수에 담는다.
        if(this.startTagName.equals("stnko")){
            this.stnko = buffer.toString().trim();
        }
        if(this.startTagName.equals("avgtamax")){
            this.avgtamax = buffer.toString().trim();
        }
        if(this.startTagName.equals("avgtamin")){
            this.avgtamin = buffer.toString().trim();
        }
        if(this.startTagName.equals("taavg")){
            this.taavg = buffer.toString().trim();
        }
        if(this.startTagName.equals("avghm")){
            this.avghm = buffer.toString().trim();
        }
    }

    // 끝 태그를 인식했을 때 처리
    public void endElement(String url, String localName, String name) {
        endTagName = name;
    }

    // parse
    public void parse() {
        try {
            parser.parse(fileName, this);
        } catch (Exception e) {
            System.out.println("XMLSAXParser Exception " + e.toString());
        }
    }

    // 추출 값 가져오기
    public String getStnko() {
        return stnko;
    }
    public String getAvgtamax() {
        return avgtamax;
    }
    public String getAvgtamin() {
        return avgtamin;
    }
    public String getTaavg() {
        return taavg;
    }
    public String getAvghm() {
        return avghm;
    }
}
