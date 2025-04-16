import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StreakDetector  implements IDatabaseAccessor{
    ArrayList<User> users;
    int Waterlimit;
    public StreakDetector(int waterlimit){
        this.Waterlimit = waterlimit;
        users = new ArrayList<>();
    }
    @Override
    public void AccessDatabase() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop_project", "root", "69675277musab");
        PreparedStatement pm  =conn.prepareStatement("select * from drinkinghistory");
        ResultSet rs = pm.executeQuery();
        while(rs.next()){
            User user  = new User(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getInt(5));
            users.add(user);
        }
    findStreak(users);
    }
    public void findStreak(ArrayList<User> users){

        HashMap<String, Integer> streakData = new HashMap<>();

        for (User entry : users) {
            streakData.put(entry.date, streakData.getOrDefault(entry.date, 0) + entry.Water/1000);
        }
        int counter=0;
        for (Map.Entry<String, Integer> entry : streakData.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            if(value>=Waterlimit){
                System.out.println("|----------------------------------|");
                System.out.println("| Date : "+key + " Water(in ml) : "+Waterlimit+"|");
                System.out.println("|----------------------------------|");
            }
            counter++;

        }
        if(counter==0){
            System.out.println("Sorry You did not meet the required streak limit");
        }

    }

}
