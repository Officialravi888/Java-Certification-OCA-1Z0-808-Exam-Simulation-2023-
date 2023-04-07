package exe5.exe17;

public class Test {
    public static void main(String[] args) {
        String[]arr={"L", "I", "V", "E"};
        int i=-2;
        if (i++==-1){
            arr[-(--i)]="F";
        }else if (--i==-2){
            arr[-++i]="0";
        }
        for (String s:arr){
            System.out.println(s);
        }
    }
}
