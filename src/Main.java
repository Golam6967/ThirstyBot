import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("                                                                                          /==========================\\ ");
        System.out.println("                                                                                         /   Welcome  To ThirstBot    \\ ");
        System.out.println("                                                                                        /==============================\\ ");



        System.out.println("|==========================================================|");
        System.out.println("| 1. Check Your Daily Water Goal                           |");
        System.out.println("| 2. Set Reminder                                          |");
        System.out.println("| 3. Log Your Water Intake                                 |");
        System.out.println("| 4. View History                                          |");
        System.out.println("| 5. Streak Tracker                                        |");
        System.out.println("| 0. Exit                                                  |");
        System.out.println("|==========================================================|");
        double WaterLimit;
        while(true){

           System.out.println("\nChoose an Option: ");
           int choice  = sc.nextInt();

           int d=0,f=0;
            switch (choice) {
                case 1:
                    WaterIntakeCalculator wic = new WaterIntakeCalculator();
                    wic.CalculateWI();
                    WaterLimit = wic.getDailyIntake();
                    break;
                case 2:
                    ReminderSetter reminder = new ReminderSetter();
                    break;
                case 3:
                    EntryLogger el = new EntryLogger();
                    el.Login();
                    break;
                case 4:
                    HIstoryLogger hl = new HIstoryLogger();
                    hl.AccessDatabase();
                    break;
                case 5:

                    break;
                case 0:
                    break;
                default:
                    d=1;
                    System.out.println("Invalid Option");
                    break;
            }
            if(choice == 0 || d == 1){
                break;
            }
            System.out.println("|==========================================================|");
            System.out.println("| 1. Check Your Daily Water Goal                           |");
            System.out.println("| 2. Set Reminder                                          |");
            System.out.println("| 3. Log Your Water Intake                                 |");
            System.out.println("| 4. View History                                          |");
            System.out.println("| 5. Streak Tracker                                        |");
            System.out.println("| 0. Exit                                                  |");
            System.out.println("|==========================================================|");
        }
    }
}
