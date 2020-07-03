package pearson.programming.java.javase8.chapter1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pearson.programming.java.javase8.tools.Util;

import java.io.File;
import java.util.Arrays;

public class C1Q3 {
    /**
     * Q: Using the list (lesane filter) method of the java.for.File class,
     * write a method that returns all files in a given directory with a given extension.
     * Use a lambda expression, not a FilenaneFilter.
     * Which variables from the enclosing scope does it capture?
     * A: Just one, the "name" variable
     */

    private static final Logger LOGGER = LoggerFactory.getLogger(C1Q3.class);

    public static void main(String[] args) {
        C1Q3 c1Q3 = new C1Q3();
        String[] filesByExtension = c1Q3.getFilesByExtension(Util.getUserHome(), ".sh");
        LOGGER.info("Files: {}", Arrays.asList(filesByExtension));
    }

    public String[] getFilesByExtension(String directory, String extension) {
        LOGGER.info("Getting files with ext({}) from {}", extension, directory);
        String ext = extension.toLowerCase();
        return new File(directory).list(((dir, name) -> name.toLowerCase().endsWith(ext)));
    }
}
