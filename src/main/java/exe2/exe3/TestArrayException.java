package exe2.exe3;

public class TestArrayException{

    public static int removeDuplicate(int arr[]){
        int j=1;

        for(int i=1;i<arr.length;i++) {
            if (arr[i-1] != arr[i]) {
                arr[j] = arr[i];
                j++;
            }

        }
        return j;
    }

    public static void main(String args[]){

        int arr[]={9,9,6,2,5,8,5,6,7,43,50,60,70,80,80};
      int l=  removeDuplicate(arr);

        for(int i=0;i<l;i++){

            System.out.println(arr[i]);

        }

    }}