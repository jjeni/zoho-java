package Assignment8;

class MyStudent implements Cloneable{
    String name;
    int rollNo;
    String department;

    MyStudent(String name, int rollNo, String department){
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
    }

    public void print(){
        System.out.println("Name : "+name);
        System.out.println("Roll NO : "+ rollNo);
        System.out.println("Department : "+department);
    }

    public MyStudent clone() throws CloneNotSupportedException{
        return (MyStudent) super.clone();
    }

}

class YourStudent{
    String name;
    int rollNo;
    String department;

    YourStudent(String name, int rollNo, String department){
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
    }

    public void print(){
        System.out.println("Name : "+name);
        System.out.println("Roll NO : "+ rollNo);
        System.out.println("Department : "+department);
    }

    public YourStudent clone() throws CloneNotSupportedException{
        return (YourStudent) super.clone();
    }

}


public class Q8 {
    public static void main(String[] args) throws CloneNotSupportedException{
        MyStudent s = new MyStudent("Jeni", 102, "EEE");
        s.print();
        MyStudent m = s.clone();
        m.print();
        YourStudent y = new YourStudent("Jack", 123, "ECE");
        y.clone(); //Without implementing clonable interface
    }
}
