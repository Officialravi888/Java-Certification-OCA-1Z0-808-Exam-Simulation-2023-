package org.example.exe8;

class Point{
    int x;
    int y;
    void assign(int x, int y){
        x=this.x; // esme koi value nahi le rha h esi ley 0 aa rha h This is not avalival;
        this.y=y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
public class Test {
    public static void main(String[] args) {
        Point p1=new Point();
        p1.x=10;
        p1.y=20;
        Point p2=new Point();
        p2.assign(p1.x, p1.y);
        System.out.println(p1.toString()+":"+p2.toString());
    }
}
