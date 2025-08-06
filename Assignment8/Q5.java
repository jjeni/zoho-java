package Assignment8;

class Address {
    String city;
    Address(String city) {
        this.city = city;
    }
}

class Person implements Cloneable{
    String name;
    int age;
    Address address;
    Person(String name, int age, Address address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public Person clone() throws CloneNotSupportedException{
        return (Person) super.clone();
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
        System.out.println("Address : "+ address.city);
    }
}

public class Q5 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("Jeni", 22, new Address("Chennai"));
        Person p2 = p1.clone();
        p1.address.city = "Madurai";
        p1.display();
        p2.display();
        System.out.println("Clone() Method is a Shalow Copy !");
    }
}
