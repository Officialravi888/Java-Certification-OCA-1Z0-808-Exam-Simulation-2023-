package exe5.exe32;

import java.io.IOException;
import java.sql.SQLException;
public class Test {
    public static void main(String[] args) {
        /*INSERT*/
        try{
            save();
            log();
        }catch (IOException|SQLException ex){}
    }

    private static void save() throws IOException {}

    private static void log() throws SQLException {}
}

