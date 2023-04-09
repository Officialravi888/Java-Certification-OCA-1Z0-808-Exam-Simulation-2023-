package todo;

public class Main2 {
    public static void Checked(int age){
        if(age>28){
            System.out.println("Access denied - You are not old enough!");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        Checked(23);
    }
}
