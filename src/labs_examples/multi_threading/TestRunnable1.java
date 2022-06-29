package labs_examples.multi_threading;

public class TestRunnable1 {
    public static void main(String[] args) {

        // Step 1: demonstrate creating a new thread using the MyRunnable class below
        MyRunnable myRunnable = new MyRunnable("first thread");
        // Step 2: demonstrate create a new thread using the MyOtherRunnable class below
        MyOtherRunnable myOtherRunnable = new MyOtherRunnable();
        myOtherRunnable.thread = new Thread(myOtherRunnable, "second thread");
        myOtherRunnable.thread.start();

    }
}

    class MyRunnable implements Runnable {
        Thread thread;

        public MyRunnable(String name){
            thread = new Thread(this, name);
            thread.start();
        }
        @Override
        public void run(){
            System.out.println("I'm in a thread name " + thread.getName() + "!");
        }
    }

    class MyOtherRunnable implements Runnable {
        Thread thread;

        @Override
        public void run(){
            System.out.println("I'm in a thread name " + Thread.currentThread().getName() + "!");
        }
    }