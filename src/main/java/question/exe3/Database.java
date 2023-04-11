package question.exe3;

public class Database {
    public static Database dbobject;
    Database(){

    }
    public static Database getInstance(){
        if (dbobject==null){
            dbobject=new Database();
        }
        return dbobject;
    }
    public void getConnection(){
        System.out.println("--------------------");
    }

}
class Main{
    public static void main(String[] args) {
        Database d1;
        d1=Database.getInstance();
        d1.getConnection();
    }
}
