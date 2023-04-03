package startpracticetest2exam2.exe26;

class Vehicle {
    public int getRegistrationNumber() {
        return 1;
    }
}

class Car {
    public int getRegistrationNumber() {
        return 2;
    }
}

public class Test {
    public static void main(String[] args) {
        Vehicle obj = new Vehicle();
        System.out.println(obj.getRegistrationNumber());
    }
}