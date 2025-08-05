package Assignment8;

class Singleton {
    private static Singleton instance;

    private Singleton(){
        System.out.println("Singleton Object is Created, Using private constructor so no one Can Create Object from Outside the Class");
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void printMessage(){
        System.out.println("Hello !");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton m = Singleton.getInstance();

        m.printMessage();

        if(s==m){
            System.out.println("Both are same Object");
        }
    }
}
