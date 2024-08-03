
import java.sql.*;

class DBConnection {

    public static void main(String[] args) {

        PreparedStatement pstmt = null;
        Connection con = null;
        ResultSet rs = null;

        try {
            String url = "jdbc:mysql://localhost:3306/registrationApp";
            String username = "root";
            String password = "password";
            con = DriverManager.getConnection(url, username, password);

            String sql = "INSERT INTO Person(name, gender, age, address, is_student) VALUES (?, ?, ?, ?, ?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, "opt");
            pstmt.setString(2, "ppon");
            pstmt.setInt(3, 22); // age should be set as an int
            pstmt.setString(4, "USA");
            pstmt.setBoolean(5, true); // is_student should be set as a boolean

            int rowInserted = pstmt.executeUpdate();
            if (rowInserted > 0) {
                System.out.println("A new person has been inserted.");
            } else {
                System.out.println("Insertion failed.");
            }
            String selectSQl = "SELECT * FROM Person";
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery(selectSQl);
            while (rs.next()) {
                System.out.println("PersonID: " + rs.getInt("PersonID"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Gender: " + rs.getString("gender"));
                System.out.println("Age: " + rs.getInt("age"));
                System.out.println("Address: " + rs.getString("address"));
                System.out.println("Is Student: " + rs.getBoolean("is_student"));
                System.out.println("----------------------------------------------------------------");

            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error closing resources: " + ex.getMessage());
            }
        }
    }
}
