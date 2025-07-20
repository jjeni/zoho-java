//5. Write a program that illustrate the execution order of static block and initializer block?


public class Q5 {

    public  Q5(){
        System.out.println("Constrctor Block");
    }

    static {
        System.out.println("Static Block");
    }

    {
        System.out.println("Instance initializer Block");
    }
    
    public static void main(String[] args) {
        System.out.println("Main Method");
        Q5 a = new Q5();
        Q5 b = new Q5();
    }
}
