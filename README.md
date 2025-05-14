# Thread Basics for Java

## **Thread Class**
The JVM (Java Virtual Machine) allows multiple execution threads to run concurrently.
* Every thread has a priority and are executed in preference accordingly.
* There are 2 ways to create a Execution Thread.
	1) Declare the working class as subclass of Thread, this class should @Override the run() method of Thread.
	2) Use Runnable Interface as mentioned below.

## **Runnable Interface**
The Runnable Interface is used:
* If you wish to execute a specific class and its instances in a separate thread. (Oracle, 2025)
* If you do not wish for the class instance to return a value. (Oracle, 2025)
* *NOTE:* Runnable does **NOT** throw a checked exception. (Oracle, 2025)

## **The Callable Interface**
The Callable Interface is used:
* If you wish to execute a task that returns a value or throws an exception, in a separate thread. (Oracle, 2025)
* call() method is used to compute a result or throw an exception if unable to do so. (Oracle, 2025)

## **Future Interface**
A specific Future is a representation of an asynchronous computation (Oracle 2025), where provided Methods await
completion and retrieve the result.
* Variable types have to be declared such as Future<String>

**FutureTask Class**
An implementation of Future using Runnable Interface, executable by an Executor (Oracle, 2025)
The following code block is provided by Oracle:
```java
 FutureTask<String> future =
   new FutureTask<String>(new Callable<String>() {
     public String call() {
       return searcher.search(target);
   }});
 executor.execute(future);
```

*NOTE:* Actions performed by asynchronous computation occur before actions following the corresponding get() method in another thread. (Oracle, 2025)
