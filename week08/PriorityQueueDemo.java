package week08;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        class Person{
            String name;
            int avaliableBread;

            public Person(String name, int avaliableBread){
                this.name = name;
                this.avaliableBread = avaliableBread;
            }
        }

        Comparator<Person> byavaliableBread = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                    return Integer.compare(p1.avaliableBread, p2.avaliableBread);
            }
        }; 

        PriorityQueue<Person> breadQueue = new PriorityQueue<>(byavaliableBread);

        breadQueue.add(new Person("Rashad", 5));
        breadQueue.add(new Person("Ayxan", 3));
        breadQueue.add(new Person ("Omar", 1));
        breadQueue.add(new Person ("Rauf", 1));
        breadQueue.add(new Person ("Ferid", 1));

        int peopleServed = 0;
        int breadInStore = 7;

        while (!breadQueue.isEmpty() && breadInStore > 0) {
            Person currentPerson = breadQueue.poll();
            if (currentPerson.avaliableBread <= breadInStore) {
                breadInStore -= currentPerson.avaliableBread;
                peopleServed++;
            }
            else{
                break;
            }
        }

        System.out.println("The number of people served: " + peopleServed);

    }
}
