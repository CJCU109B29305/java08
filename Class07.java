class CTest{
    int x ;
    
    void test(){
        if(x == 0){
            System.out.println("此數為0");  
        }
        else if (x%2 == 0){
            System.out.println("此數為偶數");
        }
        else{
            System.out.println("此數為奇數");
        }
    }
}

public class Class07 {
    public static void main(String[]argv){
        CTest a , b , c;
        a = new CTest();
        a.x = 3;
        b = new CTest();
        b.x = 8;
        c = new CTest();
        c.x = 0;
        a.test();
        b.test();
        c.test();  
    }
}
