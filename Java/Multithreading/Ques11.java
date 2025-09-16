class MyThread11_1 implements Runnable {
    Thread t;

    MyThread11_1(String tname) {
        t = new Thread(this, tname);
    }

    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread11_2 implements Runnable {
    Thread t;

    MyThread11_2(String tname) {
        t = new Thread(this, tname);
    }

    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class Ques11 {
    public static void main(String[] args) {
        MyThread11_1 t1 = new MyThread11_1("Even numbers from 2 to 20");
        MyThread11_2 t2 = new MyThread11_2("Odd numbers from 1 to 19");
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
