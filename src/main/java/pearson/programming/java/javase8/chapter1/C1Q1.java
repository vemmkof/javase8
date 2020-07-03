package pearson.programming.java.javase8.chapter1;

import java.util.Arrays;

public class C1Q1 {
    /**
     * Q: Is the comparator code in the Arrays.sort method called in the same thread as the call to sort or a different thread?
     * A: is the same
     */
    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(C1Q1.class);

    public static void main(String[] args) {
        long callId = Thread.currentThread().getId();
        String callName = Thread.currentThread().getName();
        C1Q1 questionOne = new C1Q1();
        questionOne.comparator();
        LOGGER.info("Method thread: {}-{}", callId, callName);
    }

    public void comparator() {
        Integer[] x = {5, 4, 3, 2, 1, 9, 8, 7};
        Arrays.sort(x, (o1, o2) -> {
            long comparatorId = Thread.currentThread().getId();
            String comparatorName = Thread.currentThread().getName();
            LOGGER.info("Comparator thread: {}-{}", comparatorId, comparatorName);
            return Integer.compare(o1, o2);
        });
    }
}
