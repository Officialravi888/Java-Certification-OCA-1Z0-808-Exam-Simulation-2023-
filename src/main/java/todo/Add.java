package todo;

//public class Add {
//    public static void main(String[] args) {
//        int a=1,b=3,temp;
//        temp=a+b;
//        System.out.println("sum no"+temp);
//
//    }
//}

import static javax.print.attribute.standard.MediaSizeName.A;
import static javax.print.attribute.standard.MediaSizeName.B;

class Add{
    int a=23,b=34,temp;
    public void A(){
        System.out.println("First no: "+a);
    }
    public void B(){
        System.out.println("Second no: "+b);
    }


    public static void main(String[] args) {
        Add add=new Add();
        add.A();
        add.B();


    }
}