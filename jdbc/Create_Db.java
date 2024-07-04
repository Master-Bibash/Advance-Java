
import java.sql.*;

 class Create_Db{
     public static void main(String[] args) throws Exception{
         try {
            String url="jdbc:mysql://localhost:3306";
            String databaseName="java";
            String username="root";
            String password="password";

            Connection connection=DriverManager.getConnection(url, username, password);
            System.out.println("Connection Successful");

             
         } catch (Exception e) {
         }
     }
}