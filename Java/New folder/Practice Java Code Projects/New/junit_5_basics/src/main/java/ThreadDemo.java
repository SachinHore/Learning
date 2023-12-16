


public class ThreadDemo {
    public static void main(String[] args)  {

        Runnable r1 = () ->{
            System.out.println("Thread 1");
        };

        Runnable r2 = () ->{
            System.out.println("Thread 2");
        };


        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        t2.start();

    }
}
