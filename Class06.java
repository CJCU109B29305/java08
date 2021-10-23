class CCircle{
    double pi = 3.14;
    double radius;

    void shoew_periphery(){
        System.out.println("periphery = "+2*pi*this.radius);
    }
}

public class Class06 {
    public static void main(String[]argv){
        CCircle cir1 = new CCircle();
        cir1.radius = 3.0;
        cir1.shoew_periphery();
    }
}