package day11.javapro.thread;

public class MyDeadLock implements Runnable {
    boolean flag;
    static Object o1 = new Object();
    static Object o2 = new Object();

    public MyDeadLock(boolean flag) {
        this.flag = flag;
    }

    public void run() {
        if (this.flag) {
            synchronized (o1) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (o2) {
                    System.out.println("我没发生死锁");
                }
            }
        } else {
            synchronized (o2) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o1) {
                    System.out.println("我也是");
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyDeadLock(true));
        Thread t2 = new Thread(new MyDeadLock(false));
        t1.start();
        t2.start();

    }
}
