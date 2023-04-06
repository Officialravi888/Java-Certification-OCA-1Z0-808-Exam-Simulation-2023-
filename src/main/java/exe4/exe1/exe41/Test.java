package exe4.exe1.exe41;


public class Test {
    public static void main(String[] args) {
        String [] arr = {"A", "B", "C", "D"};
        arr[0] = arr[1];
        arr[1] = "E";
        for(String s : arr) {
            System.out.print(s + " ");
        }
    }
}