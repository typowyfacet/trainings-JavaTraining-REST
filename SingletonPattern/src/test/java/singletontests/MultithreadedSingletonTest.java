package singletontests;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import singleton.MultithreadingDemo;
import singleton.Singleton;

/**
 * multithreadedSingletonTest is creating 10 threads based on MultithreadingDemo class and saving in the list.
 * After that, every thread is started and then is join all threads.
 * After execution of all addToSum methods on threads, Singleton.getInstance.printSum() is invoked and it is printing the sum.
 */

public class MultithreadedSingletonTest {

    @Test
    public void multithreadedSingletonTest() throws InterruptedException {
        List<Thread> collect = IntStream.rangeClosed(0, 9)
                .boxed()
                .map(i -> new Thread(new MultithreadingDemo()))
                .collect(Collectors.toList());
        collect.forEach(Thread::start);

        for (Thread thread : collect) {
            thread.join();
        }
        Singleton.getInstance().printSum();
    }
}

