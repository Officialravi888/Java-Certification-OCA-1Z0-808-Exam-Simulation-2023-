package org.example.exe27;

import java.util.ArrayList;
import java.util.List;

//public class Test {
//    int count;
//    Test(int count){
//        this.count=count;
//    }
//
//    @Override
//    public String toString() {
//        return "Test{" + "count=" + count + '}';
//    }
//
//    public static void main(String[] args) {
//        List<Test> list=new ArrayList<>();
//        list.add(new Test(10));
//        ArrayList<Test> coun = (ArrayList<Test>)list.clone();
//        coun.get(0).count=5;
//        System.out.println(list);
//    }
//}
class Counter {
    int count;
    Counter(int count) {
        this.count = count;
    }

    public String toString() {
        return "Counter-" + count;
    }
}

public class Test {
    public static void main(String[] args) {
        ArrayList<Counter> original = new ArrayList<>();
        original.add(new Counter(10));

        ArrayList<Counter> cloned = (ArrayList<Counter>) original.clone();
        cloned.get(0).count = 5;

        System.out.println(original);
    }
}