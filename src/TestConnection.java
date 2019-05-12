import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/first_lesson";
        String login = "root";
        String password = "131517";

        Class.forName("com.mysql.jdbc.Driver");

        try(Connection conn = DriverManager.getConnection(url, login, password)) {
            System.out.println("Connection Successful");

        }
    }
}
