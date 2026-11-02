class MyThread extends Thread {
    @Override
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("Current Thread: " + Thread.currentThread().getId() + " is running " + i);
            try {
                Thread.sleep(1500);
            }catch(InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        }
    }
}

public class ExtendingThread
{
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();
    }
}
