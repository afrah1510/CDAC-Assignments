class MyThread16_1 implements Runnable {
    Thread t;

    MyThread16_1(String tname) {
        t = new Thread(this, tname);
    }

    public void run() {
        for (int i = 65; i <= 90; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + (char) i);

            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread16_2 implements Runnable {
    Thread t;

    MyThread16_2(String tname) {
        t = new Thread(this, tname);
    }

    public void run() {
        for (int i = 97; i <= 122; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + (char) i);

            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class Ques16 {
    public static void main(String[] args) {
        MyThread16_1 t1 = new MyThread16_1("Uppercase Alphabet");
        MyThread16_2 t2 = new MyThread16_2("Lowercase Alphabet");
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
