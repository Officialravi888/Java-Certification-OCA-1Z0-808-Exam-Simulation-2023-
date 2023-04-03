package startpracticetest2exam2.exe11;

public class Test {
    public static void main(String[] args) {
        String [][] fruits={{"apple","mango"},{"orange","grape"}};
        for (String[]arr:fruits)
            for (String fruit :arr)
                System.out.println(fruit+" ");
    }
}
