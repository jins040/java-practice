import java.util.Arrays;

/**
 * Created by danawacomputer on 2017-07-14.
 */
public class CloneEx2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int[] arrClone = arr.clone();
        arrClone[0] = 6;

        System.out.println(arr);
        System.out.println(arrClone);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrClone));
    }
}
