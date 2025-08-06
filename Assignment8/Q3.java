package Assignment8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Students implements Comparable<Students> {
    int id;
    String name;

    Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Students s) {
        return this.id - s.id;  // ascending
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

public class Q3 {
    public static void main(String[] args) {
        List<Students> list = new ArrayList<>();
        list.add(new Students(24, "Jeni"));
        list.add(new Students(4, "Ben"));
        list.add(new Students(33, "Gill"));
        list.add(new Students(76, "Alex"));

        System.out.println("Before Sorting the List : ");
        for (Students s : list) {
            System.out.println(s);
        }

        Collections.sort(list);  // Uses compareTo()

        System.out.println("\nAfter Sorting the List By Id : ");
        for (Students s : list) {
            System.out.println(s);
        }
    }
}
