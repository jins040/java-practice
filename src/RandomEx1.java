import java.util.Random;

/**
 * Created by danawacomputer on 2017-07-11.
 */
public class RandomEx1 {
    public static void main(String[] args) {
        Random rand = new Random(1);
        Random rand2 = new Random(1);
        Random rand3 = new Random(2);   // Seed 값 다르게 주고 결과 확인(같은 시드값이면 같은 결과)

        System.out.println("== rand = ");
        for (int i = 0 ; i < 5 ; i++) {
            System.out.println(i + " : " + rand.nextInt());
        }
        System.out.println("== rand2 = ");
        for (int i = 0 ; i < 5 ; i++) {
            System.out.println(i + " : " + rand2.nextInt());
        }
        System.out.println("== rand2 = ");
        for (int i = 0 ; i < 5 ; i++) {
            System.out.println(i + " : " + rand3.nextInt());
        }
    }
}
