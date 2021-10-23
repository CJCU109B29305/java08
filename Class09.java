class CCalculator{
    int a;
    int b;
    int c;

    void set_value(int x,int y, int z){
        a = x;
        b = y;
        c = z;  
    }
    void show(){
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
    }
    void add(){
        System.out.println("sum = "+(a+b+c));
    }
    void sub(){
        System.out.println("sub = "+(a-b-c));
    }
    void mul(){
        System.out.println("mul = "+a*b*c);    
    }
    void avg(){
        System.out.println("avg = "+(double)(a+b+c)/3);
    }
}

public class Class09 {
    public static void main(String[]argv){
        CCalculator obj = new CCalculator();
        
        obj.set_value(25,3,7);
        obj.show();
        obj.add();
        obj.sub();
        obj.mul();
        obj.avg();
    }
}
