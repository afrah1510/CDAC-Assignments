class MyThread13 extends Thread {
    String msg;

    MyThread13(String msg) {
        this.msg = msg;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + ": " + msg);
    }
}

public class Ques13 {
    public static void main(String[] args) {
        MyThread13 t1 = new MyThread13("Called using run()");
        t1.run();

        MyThread13 t2 = new MyThread13("Called using start()");
        t2.start();
    }
}