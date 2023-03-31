package org.example.exe20;
class PenDrive{
    int capacity;
    public PenDrive(int capacity){
        this.capacity=capacity;
    }
}
class OTG extends PenDrive{
    String type;
    String make;
    OTG(int capacity, String type) {
        /*INSERT-1*/
        super(capacity);

    }
    OTG(String make) {
        /*INSERT-2*/
        super(128);
        this.make = make;
    }

}
public class Test {
    public static void main(String[] args) {
            OTG obj = new OTG(128, "TYPE-C");
            System.out.println(obj.capacity + ":" + obj.type);
    }
}
