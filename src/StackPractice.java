import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by danawacomputer on 2017-07-11.
 */
public class StackPractice {
    public static void main(String[] args) {
        Stack stack = new Stack();
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0 ; i < 5 ; i++) {
            arrayList.add(i);
        }
        System.out.println("== Input 데이터 정렬 상태 ==");
        System.out.println(arrayList + "\n");

        for (int e : arrayList) {
            stack.push(e);
        }
        System.out.println("== Stack에 push된 데이터 정렬 상태 ==");
        System.out.println(stack + "\t Stack 맨 위에 있는 값(마지막으로 들어온 값) = " + stack.peek() + "\n");

        System.out.println("== Stack에서 pop한 출력 상태(순서가 뒤집어진 상태) ==");
        while (!stack.empty()) {
            resultList.add((int)stack.pop());
        }
        System.out.println(resultList);
    }//main
}
