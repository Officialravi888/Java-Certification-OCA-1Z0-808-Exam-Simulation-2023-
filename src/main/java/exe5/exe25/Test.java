package exe5.exe25;

import java.sql.SQLException;

public class Test {
    public static void m()throws SQLException {
        try{
            throw new SQLException();
        }catch (Exception e){
            throw e;
        }
    }

    public static void main(String[] args) {
        try{
            m();

        }catch (SQLException e){
            System.out.println("Succesfull");
        }
    }
}
