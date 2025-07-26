package multithreading;

public class ThreadLifeCycle implements Runnable{
    public static void main(String[] args) {
        Thread t1 = new Thread();
        System.out.println(t1.getState());
        t1.run();
        System.out.println("its after run"+t1.getState());
    }

    @Override
    public void run() {

    }
}
