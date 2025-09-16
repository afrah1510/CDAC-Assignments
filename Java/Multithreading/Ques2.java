class MyThread2 implements Runnable {
    Thread t;

    MyThread2(String tname) {
        t = new Thread(this, tname);
    }

    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }
    }
}

public class Ques2 {
    public static void main(String[] args) {
        MyThread2 t2 = new MyThread2("Thread");
        t2.t.start();
    }
}