package tech.vdmerwe;


//We can create a new thread by extending the 'Thread" class and overriding its run() method
//NOTE: Java only allows for single inheritance, meaning if this method is used, you cant extend another class
//NOTE: you CANNOT return a value from run().
public class threadInheritance extends Thread{
    @Override
    public void run(){
        System.out.println("This is a thread running on Thread class inheritance");
    }
}
