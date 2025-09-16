class MyThread6_1 implements Runnable {
    Thread t;

    MyThread6_1(String tname) {
        t = new Thread(this, tname);
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread6_2 implements Runnable {
    Thread t;

    MyThread6_2(String tname) {
        t = new Thread(this, tname);
    }

    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class Ques6 {
    public static void main(String[] args) {
        try {
            MyThread6_1 t1 = new MyThread6_1("Thread 1");
            MyThread6_2 t2 = new MyThread6_2("Thread 2");

            t1.t.start();
            t1.t.join();

            System.out.println();

            t2.t.start();
            t2.t.join();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
