package org.example.exe37;

public class A {
    public int i1=1;
    protected int i2 = 2;
}
class B extends A {
    A obj = new A();

    public void print() {
        System.out.println(obj.i1);
        System.out.println(obj.i2);
        System.out.println(this.i2);
        System.out.println(this.i2);
    }

    public static void main(String[] args){
        new B().print();
    }
}
//o/p -: sequence print 1222;