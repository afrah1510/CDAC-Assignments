class MyThread1 extends Thread {
    MyThread1(String tname) {
        super(tname);
    }

    public void run() {
        System.out.println("Hello from Thread");
    }
}

public class Ques1 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            MyThread1 t1 = new MyThread1("Thread 1");
            t1.start();
            i++;
        }
    }
}