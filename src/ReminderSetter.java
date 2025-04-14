import java.util.Scanner;

public class ReminderSetter extends Thread {
    Scanner sc = new Scanner(System.in);
    int time;
    public ReminderSetter() {
        System.out.println("Set Your Timer in seconds");
        this.time = sc.nextInt();
        System.out.println("Timer is set to "+time);
        start();
    }
    @Override
    public void run() {
        System.out.println();
        while (time>0) {
            try {
                ReminderSetter.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            time--;
        }
        System.out.println("Time to Drink Water");

    }

}
