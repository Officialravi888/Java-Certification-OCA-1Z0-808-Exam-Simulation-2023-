package exe2.exe2;

public class StringReverseRecusive {
    public static void main(String[] args) {
        String str="kushwaha";
        StringBuilder s=new StringBuilder(str);
        str=s.reverse().toString();
        System.out.println(str);
    }

}