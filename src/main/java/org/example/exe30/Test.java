package org.example.exe30;

import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        String[] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};
        Predicate<String> p = s -> s.toUpperCase().substring(0, 1).equals("A");
        processStringArray(arr, p);
    }

    private static void processStringArray(String[] arr, Predicate<String> p) {
     for (String str: arr){
         if(p.test(str)) {
             System.out.println(str);
         }
     }

}
}
