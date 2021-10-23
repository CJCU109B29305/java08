class DBox{
    //不能有兩個CBox在同一個資料夾
    int length ;
    int width ;
    int height ; 

    void volume(){
        System.out.println("volume = "+length*width*height);
    }
    void surfaceArea(){
        System.out.println("surfaceArea = "+((length*width)+(length*height)+(width*height))*2);
    }
    void showData(){
        System.out.println("length = "+length);
        System.out.println("width = "+width);
        System.out.println("height = "+height);
    }
    void showAll(){
        showData();
        surfaceArea();
        volume();
    }
}

public class Class05 {
    public static void main(String[]args){
        DBox box = new DBox();        
        box.length = 1;
        box.width = 1;
        box.height = 1;
        box.showAll();
    }
}

