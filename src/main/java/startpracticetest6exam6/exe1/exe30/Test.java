package startpracticetest6exam6.exe1.exe30;

import java.sql.SQLException;

public class Test {
    public static void getdate()throws SQLException{
        try {
            throw new SQLException();
        }catch (SQLException e) {
            e = new SQLException();
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            getdate();
        }catch (SQLException e){
            System.out.println("SQL");
        }
    }
}
