class MyThread20 extends Thread {
    String msg;

    MyThread20(String tname, String msg) {
        super(tname);
        this.msg = msg;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + msg);
            try {
                sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class Ques20 {
    public static void main(String[] args) {
        MyThread20 t1 = new MyThread20("A", "Learning Java");
        MyThread20 t2 = new MyThread20("B", "Multithreading in action");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
