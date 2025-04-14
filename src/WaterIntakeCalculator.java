import java.util.Scanner;

public class WaterIntakeCalculator {
    PrecisionMaker pm = new PrecisionMaker();
    Scanner sc = new Scanner(System.in);

    public void CalculateWI(){
        System.out.print("Enter Your Weight :");
        int weight = sc.nextInt();
        System.out.print("Your Daily Water Intake should be : ");
        double dailyIntake = weight * 0.033 ;
        dailyIntake = pm.roundNumber(dailyIntake);
        System.out.print(dailyIntake);
        System.out.println("liters/day");
    }


}
