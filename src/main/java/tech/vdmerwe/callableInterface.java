package tech.vdmerwe;

import java.util.concurrent.Callable;
// The Callable implementation has to specify the return type in both the method and implement as a primitive Data Type
public class callableInterface implements Callable<String> {
    @Override
    public String call() throws Exception{
        return "This returns a string produced on a separate thread";
    }
}
