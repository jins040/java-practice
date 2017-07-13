import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by danawacomputer on 2017-07-11.
 */
public class PriorityQueuePractice {
    public static void main(String[] args) {
        Queue priorityQueue = new PriorityQueue();

        priorityQueue.offer(3);
        priorityQueue.offer(72);
        priorityQueue.offer(111);
        priorityQueue.offer(99);
        priorityQueue.offer(53);

        System.out.print("Priority Queue의 현재 상태 : ");
        System.out.println(priorityQueue);
        System.out.println("Priority Queue의 가장 마지막에 있는 값(최소값) = " + priorityQueue.peek() + "\n");

        ArrayList resultList = new ArrayList();
        while (priorityQueue.peek() != null) {
            resultList.add(priorityQueue.poll());
        }
        System.out.print("Priority Queue를 거쳐서 나온 결과 : ");
        System.out.println(resultList);
    }//main
}
