class MyThread3 extends Thread {
    public void run() {
        System.out.println("Child Thread Running");
    }
}

public class Ques3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread3());
        t1.start();

        System.out.println("Main Thread Running");
    }
}
