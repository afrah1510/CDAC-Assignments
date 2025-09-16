class MyThread18 implements Runnable {
    Thread t;
    static int counter = 0;

    MyThread18(String tname) {
        t = new Thread(this, tname);
    }

    public synchronized void incrementCounter() {
        counter++;
        System.out.println(Thread.currentThread().getName() + ": " + counter);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            incrementCounter();
        }
    }
}

public class Ques18 {
    public static void main(String[] args) {
        MyThread18 t1 = new MyThread18("Thread A");
        MyThread18 t2 = new MyThread18("Thread B");

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
