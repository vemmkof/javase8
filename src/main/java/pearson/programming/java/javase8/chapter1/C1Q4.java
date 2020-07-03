package pearson.programming.java.javase8.chapter1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pearson.programming.java.javase8.tools.Util;

import java.io.File;
import java.util.Arrays;

public class C1Q4 {
    /**
     * Given an array of file objects, sort it so that the directories come before the files,
     * and within each group, elements are sorted by path name. Use a lambda expression, not a Comparator.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(C1Q4.class);

    public static void main(String[] args) {
        C1Q4 c1Q4 = new C1Q4();
        System.out.println(Util.getUserHome());
        File[] files = new File(Util.getUserHome()).listFiles();
        LOGGER.info("Unsorted files: {}", Arrays.asList(files));
        c1Q4.sortFiles(files);
        LOGGER.info("Sorted files: {}", Arrays.asList(files));
    }

    public void sortFiles(File[] files) {
        Arrays.sort(files, (o1, o2) -> {
            if (o1.isDirectory()) {
                if (o2.isFile()) {
                    return -1;
                }
            } else if (o2.isDirectory()) {
                return 1;
            }
            return o1.getName().compareToIgnoreCase(o2.getName());
        });
    }


}
