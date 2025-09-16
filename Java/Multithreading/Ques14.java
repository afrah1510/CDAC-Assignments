class MyThread14 extends Thread {
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println(Thread.currentThread().getName() + ": " + sum);
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Ques14 {
    public static void main(String[] args) {
        MyThread14 t1 = new MyThread14();
        t1.start();

        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
