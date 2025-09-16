class MyThread5 extends Thread {
    public void run() {
        System.out.println("\n" + Thread.currentThread().getName() + " is running with priority "
                + Thread.currentThread().getPriority());
    }
}

public class Ques5 {
    public static void main(String[] args) {
        MyThread5 t0 = new MyThread5();
        MyThread5 t1 = new MyThread5();

        System.out.println("Before setting priority");
        System.out.println("t0 priority: " + t0.getPriority());
        System.out.println("t1 priority: " + t1.getPriority());

        t0.setPriority(6);
        t1.setPriority(1);

        System.out.println("\nAfter setting priority");
        System.out.println("t0 priority: " + t0.getPriority());
        System.out.println("t1 priority: " + t1.getPriority());

        t0.start();
        t1.start();
    }
}
