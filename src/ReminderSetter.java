import java.util.Scanner;

public class ReminderSetter extends Thread {
    Scanner sc = new Scanner(System.in);
    int time;
    public ReminderSetter() {
        System.out.println("Set Your Timer in seconds");
        this.TimerSetup(sc.nextInt());
        System.out.println("Timer is set to "+time);
    }
    public void TimerSetup(int time){
        this.time = time;
        start();
    }
    @Override
    public void run() {
        int timeElapsed = 100000000;
        System.out.println();
        while (timeElapsed>0) {
            try {
                ReminderSetter.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(timeElapsed%time==0){
                System.out.println("                                                           |>>>>>>>>>>>>>>>>>>>>>|");
                System.out.println("                                                           | Time to Drink Water |");
                System.out.println("                                                           |>>>>>>>>>>>>>>>>>>>>>|");
                System.out.println();
            }
            timeElapsed--;
        }
    }

}
