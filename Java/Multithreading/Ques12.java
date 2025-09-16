class MyThread12 extends Thread {
    String msg;

    MyThread12(String tname, String msg) {
        super(tname);
        this.msg = msg;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + msg);
            try {
                sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class Ques12 {
    public static void main(String[] args) {
        MyThread12 t1 = new MyThread12("A", "Hello! I'm Thread 1");
        MyThread12 t2 = new MyThread12("B", "Bonjour! I'm Thread 2");
        MyThread12 t3 = new MyThread12("C", "Ni Hao! I'm Thread 3");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
