package exe4.exe1.exe53;

public class Test {
    public static void main(String[] args) {
        char[] arr1 = {1, 2, 3};
        char [] arr2 = {'A', 'B'}; //ASCII code of 'A' is 65, 'B' is 66
        arr1 = arr2;
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}