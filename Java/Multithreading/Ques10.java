class MyThread10_1 implements Runnable {
    Thread t;

    MyThread10_1(String tname) {
        t = new Thread(this, tname);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": Good Morning");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread10_2 implements Runnable {
    Thread t;

    MyThread10_2(String tname) {
        t = new Thread(this, tname);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": Welcome");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class Ques10 {
    public static void main(String[] args) {
        MyThread10_1 t1 = new MyThread10_1("Thread 1");
        MyThread10_2 t2 = new MyThread10_2("Thread 2");
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
