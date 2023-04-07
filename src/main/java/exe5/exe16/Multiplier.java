package exe5.exe16;

import java.sql.SQLException;

public class Multiplier {
    void multiply(int... x)throws Exception {

    }
}
class Calculator extends Multiplier {
    public void multiply(int... x)throws Exception{

    }
}
class Test{
    public static void main(String[] args) {
        try {
            Multiplier obj = new Calculator(); //Line n1
            obj.multiply(3);
        } catch(SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}