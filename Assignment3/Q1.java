package Assignment3;

public class Q1 {
    public static void main(String[] args) {
        Student s1 = new Student("Jeni", 66);
    }
}

class Student {
    String name;
    int roll_no;

    Student(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;
        Display();
    }

    void Display(){
        System.out.println("Name of the Student : " + name);
        System.out.println("Roll Number : " + roll_no);
    }
}