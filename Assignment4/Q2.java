package Assignment4;

class twoD {
    private double x, y;

    twoD(){
        System.out.println("TwoD default constructor");
        x = 0;
        y = 0;
    }

    twoD(double x, double y){
        System.out.println("TwoD constructor with Two Arguments");
    }

    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

}

class ThreeD extends twoD {
    private double z;

    public void setZ(double z){
        this.z = z;
    }
    public double getZ(){
        return z;
    }
    public ThreeD() {
        super();
        z = 0;
    }
    public ThreeD(double x, double y, double z) {
        super(x,y); 
        this.z = z;
    }

    public double calculate(ThreeD other){
        double dx = this.getX() - other.getX();
        double dy = this.getY() - other.getY();
        double dz = this.getZ() - other.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

}


public class Q2 {
    public static void main(String[] args) {
        ThreeD point1 = new ThreeD();
        point1.setX(1);
        point1.setY(2);
        point1.setZ(3);

        ThreeD point2 = new ThreeD(4,5,6);
        
        double distance = point1.calculate(point2);
        System.out.println("Distance between point1 and point2: " + distance);

    }
}
