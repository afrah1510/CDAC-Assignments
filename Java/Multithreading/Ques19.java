import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class MyThread19 implements Runnable {
    Thread t;

    MyThread19(String tname) {
        t = new Thread(this, tname);
    }

    public void run() {
        DateTimeFormatter d = DateTimeFormatter.ofPattern("HH:mm:ss");
        for (int i = 0; i < 5; i++) {
            LocalTime now = LocalTime.now();
            System.out.println("Current Time: " + now.format(d));
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class Ques19 {
    public static void main(String[] args) {
        MyThread19 t1 = new MyThread19("Thread1");
        t1.t.start();

        try {
            t1.t.join();
            ;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
