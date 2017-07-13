import java.util.StringTokenizer;

/**
 * Created by danawacomputer on 2017-07-11.
 */
public class StringTokenizerEx2 {
    public static void main(String[] args) {
        String sampleExpression = "x = 100*(200+300)/2";
        StringTokenizer st = new StringTokenizer(sampleExpression, "=*()+/ ", true);
        //StringTokenizer 맨 뒤에 true 있으면 구분자도 token으로 간주해서 출력해준다.

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
