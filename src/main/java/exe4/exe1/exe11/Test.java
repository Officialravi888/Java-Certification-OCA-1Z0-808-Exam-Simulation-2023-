package exe4.exe1.exe11;


import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        String [] arr = {"*", "**", "***", "****", "*****", "******"};
        Predicate<String> pr1 = s -> s.length() < 4;
        print(arr, pr1);
    }

    private static void print(String [] arr, Predicate<String> predicate) {
        for(String str : arr) {
            if(predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}