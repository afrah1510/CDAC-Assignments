class MyThread8 extends Thread {
    public void run() {
        System.out.println("Child Thread Running");
    }
}

public class Ques8 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread8());
        t1.start();
        try {
            t1.join();
            System.out.println("Child thread finished running");
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Main Thread Running");
    }
}
