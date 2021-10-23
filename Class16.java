class CSphere{
    private int x;
    private int y;
    private int z;
    private int radius;
    

    public void setLocation(int a , int b , int c){
        x = a;
        y = b;
        z = c;
    }
    void setRadius(int r){
        radius = r;
    }
    void surfaceArea(){
        System.out.println("surfaceArea = "+4*radius*radius*3.14);
    }
    void volume(){
        System.out.println("volume = "+radius*radius*radius*3.14*4/3);
    }
    void showCenter(){
        System.out.println("center = ("+x+","+y+","+z+")");
    }
}

public class Class16 {
    public static void main(String[]argv){
        CSphere obj = new CSphere();
        obj.setLocation(3, 4, 5);
        obj.setRadius(1);
        obj.surfaceArea();
        obj.volume();
        obj.showCenter();
    }
}
