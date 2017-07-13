/**
 * Created by danawacomputer on 2017-07-13.
 */
public class ExceptionEx9 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생시켰음..");
            throw e;
            //throw new Exception("고의로 발생시켰음.."); 이렇게 한 줄로 줄여도 가능
        } catch (Exception e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Program terminated..");
    }//main
}
