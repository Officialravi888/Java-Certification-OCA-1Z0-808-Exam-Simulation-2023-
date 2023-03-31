package org.example.example1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<String>list1=new ArrayList<>();
        list1.add("Aom");
        list1.add("Jerry");
        Iterator<String> iterator=list1.iterator();
        while (iterator.hasNext()){
        String list = iterator.next();
        if (list.startsWith("A")){
            list1.remove(list);
        }
        }
        System.out.println(list1);
    }
}
