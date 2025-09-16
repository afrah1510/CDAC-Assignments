class MyThread4 extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class Ques4 {
    public static void main(String[] args) {
        MyThread4 t1 = new MyThread4();
        MyThread4 t2 = new MyThread4();

        System.out.println("Thread 1: " + t1.getName());
        System.out.println("Thread 2: " + t2.getName());

        t1.start();
        t2.start();

        t1.setName("MyThread4 Thread1");
        t2.setName("MyThread4 Thread2");

        System.out.println("\nAfter changing thread names");
        System.out.println("Thread 1: " + t1.getName());
        System.out.println("Thread 2: " + t2.getName());
    }
}
