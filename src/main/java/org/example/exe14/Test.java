package org.example.exe14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.list;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
        //list.remove(1);
        list.removeAll(Collections.singleton(100));
        System.out.println(list);
    }
}
