package org.example.exe15;

public class Test {
    public static void main(String[] args) {
        double price=90000;
        String model;
        if(price>100000){
            model="Tesla Model x";
        } else if (price <= 100000) {
            //model"Tesla Model s";// compile time error
        }
        //System.out.println(model);
    }
}
