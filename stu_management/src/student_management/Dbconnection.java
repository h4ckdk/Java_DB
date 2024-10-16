package student_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {
    private static final String url = "jdbc:mysql://localhost:3306/details";
    private static final String user = "root";
    private static final String password = "Dinesh@04";

    public static Connection getconnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }
}
