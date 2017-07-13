/**
 * Created by danawacomputer on 2017-07-13.
 */
public class Exception12 {
    public static void main(String[] args) throws Exception{
        method1();
    }//main

    static void method1() throws Exception{
        method2();
    }

    static void method2() throws Exception{
        throw new Exception("Exception 던지기");
    }
}
