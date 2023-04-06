package exe4.exe1.exe13;

import java.util.ArrayList;
import java.util.List;

abstract class Animal {}
class Dog extends Animal{}

public class Test {
    public static void main(String [] args) {
        List<Animal> list = new ArrayList<>();
        list.add(0, new Dog());
        System.out.println(list.size() > 0);
    }
}