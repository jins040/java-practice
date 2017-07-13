import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-07-11.
 */
//ArrayList, Linked List 장단점 비교

public class ArrayListLinkedListTest {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList(2000000);
        LinkedList linkedList = new LinkedList();

        //순차적 추가
        System.out.println("==순차적 추가==");
        System.out.println("Array List : " + addSequentially(arrayList));
        System.out.println("Linked List : " + addSequentially(linkedList) + "\n");
        //중간에 추가
        System.out.println("==중간에 추가==");
        System.out.println("Array List : " + addMidway(arrayList));
        System.out.println("Linked List " + addMidway(linkedList) + "\n");
        //중간에 삭제
        System.out.println("==중간에 삭제==");
        System.out.println("Array List : " + removeMidway(arrayList));
        System.out.println("Linked List " + removeMidway(linkedList) + "\n");
        //순차적 삭제
        System.out.println("==순차적 삭제==");
        System.out.println("Array List : " + removeSequentially(arrayList));
        System.out.println("Linked List " + removeSequentially(linkedList) + "\n");
    }

    public static long addSequentially(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0 ; i < 1000000 ; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long addMidway(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0 ; i < 10000 ; i++) {
            list.add(700, "X");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long removeMidway(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0 ; i < 10000 ; i++) {
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long removeSequentially(List list) {
        long start = System.currentTimeMillis();
        for (int i = list.size() - 1 ; i >= 0 ; i--) {
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

}
