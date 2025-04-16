import java.sql.*;

public class DatabaseSetup {
        public static void main(String[] args) throws SQLException {
                DatabaseSetup databaseSetup = new DatabaseSetup();
                databaseSetup.ConnectToDatabase("musab",23);
        }
        public void ConnectToDatabase(String name,int age) throws SQLException {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop_project", "root", "69675277musab");
                Statement statement = conn.createStatement();
                //String sql = "CREATE TABLE IF NOT EXISTS DrinkingHistory ("+"name varchar(50) ,"+"    Time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ,"+ "Age int)";


        }
        public void Execute(){

        }

}
