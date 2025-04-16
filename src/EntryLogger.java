import java.sql.SQLException;
import java.util.Scanner;

public class EntryLogger{
    DatabaseSetup databaseSetup = new DatabaseSetup();
    Scanner st = new Scanner(System.in);
    Scanner inte = new Scanner(System.in);


    public void Login() throws SQLException {
        System.out.print("Enter Your Name : ");
        String name = st.nextLine();
        System.out.println();
        System.out.print("Enter Your Age : ");
        int age = inte.nextInt();
        System.out.println();
        databaseSetup.ConnectToDatabase(name,age);
        System.out.println("Your Data has been Updated Successfully");

    }
}
