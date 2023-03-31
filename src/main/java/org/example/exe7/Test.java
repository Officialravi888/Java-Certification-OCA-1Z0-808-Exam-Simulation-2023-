package org.example.exe7;

import java.util.ArrayList;
import java.util.List;

public class Test {///Run time Execption
    public static void main(String[] args) {
        List<Character>list=new ArrayList<>();
        list.add(0,'V');
        list.add('T');
        list.add(1,'E');
        list.add(3,'o');
        if(list.contains('o')){
            list.remove('o');
        }
        for (char ch: list){
            System.out.println(ch);
        }

    }
}
