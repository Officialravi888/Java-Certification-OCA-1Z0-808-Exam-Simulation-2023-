package org.example.exe2;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String[]names={"Ravi","Kant","Tom","Som"};
        List<String >list=new ArrayList<>();
        for (int x=0; x< names.length; x++){
            list.add(names[x]);
            switch (x){
                case 2:
                    continue;
            }
break;
        }
        System.out.println(list.size());
    }
}
