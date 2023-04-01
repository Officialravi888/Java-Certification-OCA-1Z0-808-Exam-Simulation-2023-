package org.example.exe43;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(new Integer(2));
        list.add(new Integer(1));
        list.add(new Integer(0));
        list.remove(list.indexOf(0));//indexOf ==remove ==[1,0]
        System.out.println(list);
    }
}
