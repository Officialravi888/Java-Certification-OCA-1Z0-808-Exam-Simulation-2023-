package exe5.exe3;

public class Test {
    public static void main(String[] args) {
        String [][] arr = { {"%", "$$"}, {"***", "@@@@", "#####"}};
        for(String [] str : arr) {
            for(String s : str) {
                System.out.println(s);
                if(s.length() == 4) //Line n1
                    break; //Line n2
            }
            break; //Line n3
        }
    }
}
