
import java.sql.*;

class StoreValueGUI {

    public static void main(String[] args) {
        PreparedStatement pstmt = null;
        Connection con = null;
        ResultSet rs = null;
        try {
            String url = "jdbc:mysql://localhost:3306/registrationApp";
            String username = "root";
            String password = "password";
            con = DriverManager.getConnection(url, username, password);

        } catch (Exception e) {
        }

    }
}
