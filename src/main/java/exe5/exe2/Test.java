package exe5.exe2;

public class Test {
    private double radius;
    public Test(double radius){
        this.radius=radius;
    }
    public double Area(){
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Test test=new Test(23);
    }
}
