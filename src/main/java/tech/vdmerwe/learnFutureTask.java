package tech.vdmerwe;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class learnFutureTask {
    public static boolean searchDataSet(String object) throws InterruptedException {
        String dataSet = "The Apple Doesn't Fall Far From The Tree";
        // Simulate a large dataset to search through, say it takes 1,5 seconds
        Thread.sleep(1500);
        return dataSet.matches(".*\\b" + object + "\\b.*");
    }
    public static void main(String[] args) throws Exception{
        // Say we want to search a dataset to see if it contains a specific String object
        String object = "Apple";

        // Create an ExecutorService to manage the thread
        try (ExecutorService executor = Executors.newSingleThreadExecutor()) {


            // Create the FutureTask that runs a method to search a dataset
            FutureTask<Boolean> future = new FutureTask<>(new Callable<Boolean>() {
                public Boolean call() throws InterruptedException {
                    return searchDataSet(object);
                }
            });


            // Do some work
            // more tasks
            // Submit task for execution
            executor.execute(future);
            Boolean result = future.get();
            System.out.println("Result of the dataset Search: " + result);
            //Terminate Executor
            executor.shutdown();
        }
    }
}
