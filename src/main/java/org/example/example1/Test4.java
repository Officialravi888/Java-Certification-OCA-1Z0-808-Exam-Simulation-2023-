package org.example.example1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Test4 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Tom", 23, 150000.0));
        list.add(new Employee("Som", 23, 150000.0));
        process(list, e -> e.getSalary() >= 1000);
        System.out.println(list);
    }

    private static void process(List<Employee> list, Predicate<Employee> predicate) {
        Iterator<Employee> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (predicate.test(iterator.next()))
                iterator.remove();
        }
    }
}
