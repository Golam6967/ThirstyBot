import java.sql.*;

public class DatabaseSetup {
        public void ConnectToDatabase(String name,int age) throws SQLException {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop_project", "root", "69675277musab");
                PreparedStatement ps = conn.prepareStatement("insert into drinkinghistory(name,Age) values(?,?)");
                ps.setString(1,name);
                ps.setInt(2,age);
                ps.executeUpdate();
                //String sql = "CREATE TABLE IF NOT EXISTS DrinkingHistory ("+"name varchar(50) ,"+"    Time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ,"+ "Age int)";


        }
        public void Execute(){

        }

}
