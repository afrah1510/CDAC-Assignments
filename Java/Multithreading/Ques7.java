class MyThread7 implements Runnable {
    Thread t;

    MyThread7(String tname) {
        t = new Thread(this, tname);
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class Ques7 {
    public static void main(String[] args) {
        try {
            MyThread6_1 t1 = new MyThread6_1("Thread 1");
            t1.t.start();
            t1.t.join();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
