class MyThread15 implements Runnable {
    Thread t;
    private boolean flag = true;

    MyThread15(String tname) {
        t = new Thread(this, tname);
    }

    public void run() {
        int i = 0;
        while (flag) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            i++;
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " stopped!");
    }

    public void stopThread() {
        flag = false;
    }
}

public class Ques15 {
    public static void main(String[] args) {
        MyThread15 t1 = new MyThread15("Thread 1");
        MyThread15 t2 = new MyThread15("Thread 2");

        t1.t.start();
        t2.t.start();

        try {
            Thread.sleep(1000);
            t1.stopThread();
            t2.stopThread();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
