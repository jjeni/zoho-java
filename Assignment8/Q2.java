package Assignment8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return id + " - " + name;
    }
    
}

class NameComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s1.name.compareTo(s2.name);
    }
}

public class Q2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(24, "Jeni"));
        list.add(new Student(4, "Ben"));
        list.add(new Student(33, "Gill"));
        list.add(new Student(76, "Alex"));
        System.out.println("Before Sorting the List : ");
        for(Student s : list){
            System.out.println(s);
        }

        Collections.sort(list, new NameComparator());

        System.out.println("\nAfter Sorting the List By Name : ");
        for(Student s : list){
            System.out.println(s);
        }

        
    }
}
