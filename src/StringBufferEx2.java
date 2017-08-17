/**
 * Created by danawacomputer on 2017-07-14.
 */
public class StringBufferEx2 {
    public static void main(String[] args) {

        long startSB = System.currentTimeMillis();

        StringBuffer sb = new StringBuffer("01");
        StringBuffer sb2 = sb.append(23);
        sb.append('4').append(56);

        StringBuffer sb3 = sb.append(78);
        sb3.append(9.0);

        System.out.println("sb = " + sb);
        System.out.println("sb2 = " + sb2);
        System.out.println("sb3 = " + sb3);

        System.out.println("sb = " + sb.deleteCharAt(10));
        System.out.println("sb2 = " + sb.delete(3,6));
        System.out.println("sb3 = " + sb.insert(3, "abc"));
        System.out.println("sb = " + sb.replace(6, sb.length(), "END"));

        System.out.println("capacity = " + sb.capacity());
        System.out.println("length = " + sb.length());

        long endSB = System.currentTimeMillis();
        long timeSB = endSB - startSB;
        System.out.println("time in StringBuffer = " + timeSB);

        System.out.println();

        long startS = System.currentTimeMillis();

        String s = "01";
        s = s + 23;
        String s2 = s;
        s = s + '4' + 56;
        s2 = s;

        s =  s + 78;
        s2 = s;
        String s3 = s;
        s = s + 9.0;
        s2 = s;
        s3 = s3 + 9.0;

        System.out.println("s = " + s);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        s = s.replace(s.substring(10), "0");
        System.out.println("s = " + s);
        s = s.replace(s.substring(3, 6), "");
        System.out.println("s2 = " + s);
        s = s.replace(s, s.substring(0,3) + "abc" + s.substring(3,8));
        System.out.println("s3 = " + s);
        s = s.replace(s.substring(6,11), "END");
        System.out.println("s = " + s);

        System.out.println("length = " + s.length());

        System.out.println();

        long endS = System.currentTimeMillis();
        long timeS = endS - startS;
        System.out.println("time in String = " + timeS);
    }
}
