package pearson.programming.java.javase8.chapter1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class C1Q5 {
    /**
     * Take a file from one of your projects that contains a number of ActionListener, Runnable, or the like.
     * Replace them with lambda expressions.
     * How many lines did it save?
     * Was the code easier to read?
     * Were you able to use method references?
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(C1Q5.class);

    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                LOGGER.info("Runnable {}", i + 1);
            }
        };
        new Thread(runnable).start();
    }
}
