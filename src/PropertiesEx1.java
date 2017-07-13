import java.util.Enumeration;
import java.util.Properties;

/**
 * Created by danawacomputer on 2017-07-11.
 */
public class PropertiesEx1 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        //prop에 (key, value) 저장
        prop.setProperty("timeout", "30");
        prop.setProperty("language", "kr");
        prop.setProperty("size", "10");
        prop.setProperty("capacity", "10");

        //Property의 key 값을 추출
        Enumeration e = prop.propertyNames();
        System.out.println(e);
        //key 값에 대응하는 value 추출
        while (e.hasMoreElements()) {
            String element = (String)e.nextElement();
            System.out.println(element + " = " + prop.getProperty(element));
        }
        System.out.println();

        prop.setProperty("size", "20");
        System.out.println("size = " + prop.getProperty("size"));

        System.out.println("capacity = " + prop.getProperty("capacity", "20"));

        System.out.println("loadfactor = " + prop.getProperty("loadfactor", "0.75"));

        System.out.println();
        System.out.println(prop);

        System.out.println();
        System.out.println("== prop에 저장된 요소들을 화면에 출력 ==");
        prop.list(System.out);

    }//main
}
