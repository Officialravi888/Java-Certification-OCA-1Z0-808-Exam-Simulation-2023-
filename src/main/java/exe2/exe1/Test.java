package exe2.exe1;

class StringRevers{
    public static void main(String[] args) {
        String str="Ravi Kant";
        String revers= "";
        for (int i=str.length()-1; i>=0; --i){
            revers+=str.charAt(i);
        }
        System.out.println(revers);

    }

}

