package multithreading;

public class ThreadLifeCycle {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        System.out.println(t1.getState());
    }
}
