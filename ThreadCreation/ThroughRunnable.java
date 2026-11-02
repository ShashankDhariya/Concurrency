class MyRunnable implements Runnable {
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

public class ThroughRunnable
{
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();
    }
}
