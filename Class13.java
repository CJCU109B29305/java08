class DDircle{
    //不能有兩個CCircle在同一個資料夾
    double pi = 3.14;
    double radius;

    void area(double r){
        radius = r;
        System.out.println("area = "+(double)(radius*radius*pi));
    }
    void area(float r){
        radius = r;
        System.out.println("area = "+(float)(radius*radius*pi));
    }
    void area(int r){
        radius = r ;
        System.out.println("area = "+(double)(radius*radius*pi));
    }
    
}

public class Class13 {
    public static void main(String[]argv){
        DDircle a = new DDircle();
        
        a.area(2);
        a.area(2.2f);
        a.area(2.2);   
    }
}
