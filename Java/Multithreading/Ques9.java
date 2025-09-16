class MyThread9 extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
    }
}

public class Ques9 {
    public static void main(String[] args) {
        MyThread9 t = new MyThread9();
        t.start();
        System.out.println("Is thread alive? " + t.isAlive());
    }
}
