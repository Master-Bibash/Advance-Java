
import java.sql.*;

class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        try {
            String url = "jdbc:mysql://localhost:3306/registrationApp";
            String username = "root";
            String password = "password";
            DriverManager.getConnection(url, username, password);

            //   DBConnection connection = new DBConnection();
            //   connection.getConnection();
        } catch (Exception e) {
            System.out.println("error is " + e.getMessage());
        }

    }
}
