package week08;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        int[] breadArray = { 1, 5, 2, 3, 4, 6, 6 };

        int avaliableBread = 10;

        Queue<String> breadQueue = new LinkedList<>();

        breadQueue.add("Rashad");
        breadQueue.add("Ramin");
        breadQueue.add("Ramil");
        breadQueue.add("Rasim");
        breadQueue.add("Racid");

        int peopleServed = 0;
        while (!breadQueue.isEmpty() && avaliableBread > 0) {
            int breadRequested = breadArray[peopleServed];
            if (breadRequested <= avaliableBread) {
                breadQueue.poll();
                avaliableBread -= breadRequested;
                peopleServed++;
            }
            else{
                break;
            }
        }

        System.out.println("The number of people served: " + peopleServed);
    }

}
