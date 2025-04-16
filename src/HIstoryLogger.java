import java.sql.*;

public class HIstoryLogger implements IDatabaseAccessor{


    @Override
    public void AccessDatabase() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop_project", "root", "69675277musab");
        PreparedStatement pm  =conn.prepareStatement("select * from drinkinghistory");
        ResultSet rs = pm.executeQuery();
        int counter = 0;

        while(rs.next()){
            if(counter == 0){
            System.out.println("|-----------------------------------------------------------------------------------|");
            System.out.println("|   Name      |  Age            |     Date      | Time            | Water(in Ml)    |");
            System.out.println("|-----------------------------------------------------------------------------------|");
            }
            counter++;
            String name = rs.getString(1);
            int age = rs.getInt(2);
            String date = rs.getString(3);
            String time = rs.getString(4);
            int  Water = rs.getInt(5);
            System.out.println("|-----------------------------------------------------------------------------------|");
            System.out.println("| "+name+"    |     "+age+"     |     "+date+"  |   "+time+"      |     "+Water+"        |");
            System.out.println("|-----------------------------------------------------------------------------------|");

        }
        if(counter == 0){
            System.out.println("No drinking history found");
        }
    }
}
