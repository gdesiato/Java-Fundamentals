package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */

class Exercise_05 {

    public static void main(String[] args) throws InterruptedException {

        RunT_01 t1 = new RunT_01();
        t1.thread = new Thread(t1, "Buy");
        t1.thread.start();

        RunT_02 t2 = new RunT_02();
        t2.thread = new Thread(t2, "Eat");
        t2.thread.start();


        t1.thread.join();
        t2.thread.join();

    }
}

class RunT_01 implements Runnable {
    Thread thread;
    FoodProcess foodProcess = new FoodProcess();

    @Override
    public void run() {
        try {
            foodProcess.buy();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class RunT_02 implements Runnable {
    Thread thread;
    FoodProcess foodProcess = new FoodProcess();

    @Override
    public void run() {
        try {
            foodProcess.eat();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}