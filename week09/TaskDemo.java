package week09;

import java.util.PriorityQueue;

public class TaskDemo {
    public static void main(String[] args) {
        Task task1 = new Task("pp2 exam prep", 15.5, 6);
        Task task2 = new Task("calc exam prep", 20.6, 1);
        Task task3 = new Task("pp1 exam prep", 5.6, 3);

        PriorityQueue<Task> pq = new PriorityQueue<>();
        pq.add(task1);
        pq.add(task2);
        pq.add(task3);

        double availableTime = 30;

        System.out.println("Tasks that can be completed within " + availableTime + " time:");

        double totalTime = 0;
        while (!pq.isEmpty()) {
            Task currenTask = pq.poll();
            if (totalTime + currenTask.getDuration() <= availableTime) {
                System.out.println(currenTask);
                totalTime += currenTask.getDuration();
            } else {
                break;
            }
        }

        String formattedTime = String.format("%.2f", totalTime);
        System.out.println("Available time was: " + availableTime);
        System.out.println("Total time spent on tasks: " + formattedTime);
        if (totalTime == availableTime) {
            System.out.println("Total time matches with available time");
        }
        else {
            System.out.println("Total time doesn't match with available time");
        }

    }

}
