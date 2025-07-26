package Assignment3;

public class Q2 {
    public static void main(String[] args) {
        Students s1 = new Students("Sam", 1001, 878675645, "1-789 North Street, Surandai");
        Students s2 = new Students("John", 1002, 908978656, "2-789 South Street, Tenkasi");
    }
}

class Students {
    String name;
    int roll_no;
    int phone_no;
    String address;

    Students(String name, int roll_no, int phone_no, String address){
        this.name = name;
        this.roll_no = roll_no;
        this.phone_no = phone_no;
        this.address = address;
        Display();
    }

    void Display(){
        System.out.println("Name of the Student : " + name);
        System.out.println("Roll Number : " + roll_no);
        System.out.println("Phone Number : " + phone_no);
        System.out.println("Address : " + address);
    }
}