class MyThread17 implements Runnable {
    Thread t;
    static int counter = 0;

    MyThread17(String tname) {
        t = new Thread(this, tname);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            counter++;
            System.out.println(Thread.currentThread().getName() + ": " + counter);
        }
    }
}

public class Ques17 {
    public static void main(String[] args) {
        MyThread17 t1 = new MyThread17("Thread A");
        MyThread17 t2 = new MyThread17("Thread B");

        t1.t.start();
        t2.t.start();

        try {
            t1.t.join();
            t2.t.join();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
