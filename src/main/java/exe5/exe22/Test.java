package exe5.exe22;

import exe4.exe1.exe25.C;

class Car{
    void speed(Byte val){
        System.out.println("------");
    }
    void speed(byte vals){
        System.out.println("-----------");
    }
}
public class Test {
    public static void main(String[] args) {
        byte b=10;
        new Car().speed(b);
    }
}
