package pearson.programming.java.javase8.chapter1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class C1Q6 {
    /**
     * Didn't you always hate it that you had to deal with checked exceptions in a Runnable?
     * Write a method uncheck that catches all checked exceptions and turns them into unchecked exceptions.
     * For example,
     * new Thread(uncheck(
     * () -> { System.out.println("Zzz"); Thread.sleep(1000); })).start();
     * // Look, no catch (InterruptedException)!
     * <p>
     * Hint: Define an interface Runnable whose run method may throw any exceptions.
     * Then implement public static Runnable uncheck(RunnableEx runner).
     * Use a lambda expression inside the uncheck method.
     * <p>
     * Why can't you just use Callable<Void> instead of RunnableEx?
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(C1Q6.class);

    public static void main(String[] args) {

    }


}
