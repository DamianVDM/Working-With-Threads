package tech.vdmerwe;

public class runnableInterface implements Runnable{
    //Runnable is a functional interface with a single method, run()
    //It is passed either a thread or an ExecutorService
    //CANNOT Return a value or throw checked exceptions
    @Override
    public void run(){
        System.out.println("This is a thread running on the runnable interface");
    }
}
