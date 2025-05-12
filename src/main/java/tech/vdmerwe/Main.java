package tech.vdmerwe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception{
        // To use a new thread as mentioned in the threadInheritance class I made earlier
        // Create an object and then 'start' the thread

        threadInheritance threadInheritance1 = new threadInheritance();
        threadInheritance threadInheritance2 = new threadInheritance();
        threadInheritance1.start(); // This would start a task on a separate thread
        threadInheritance2.start(); // This would start the same task on a separate thread operating at the same time.


        // To make use of the Runnable interface implemented in runnableInterface class
        // Runnable is used when you need to execute a task without returning a result, and want more flexibility than extending Thread
        Thread runnableThread = new Thread(new runnableInterface());
        Thread runnableThread2 = new Thread(new runnableInterface());
        runnableThread.start(); // Starts task on a new thread
        runnableThread2.start(); // Starts task on a new thread simultaneously

        // TO make use of the Callable interface, we need to store the value it produces for use in the Future using an ExecutorService (auto thread management)
        ExecutorService threadManager = Executors.newSingleThreadExecutor();
        // Future needs to hold the variable type returned from Thread
        Future<String> stringValueReceivedFromThread = threadManager.submit(new callableInterface());
        //Store the result of the thread
        String resultFromThread = stringValueReceivedFromThread.get();

        System.out.println(resultFromThread);
        // ALWAYS shutdown executor after use
        threadManager.shutdown();
    }
}
