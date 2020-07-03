package pearson.programming.java.javase8.chapter1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Arrays;

public class QuestionTwo {
    /**
     * Using the listFiles(FileFilter) and isDirectory methods of the java.io.File class write a method that
     * returns all subdirectories of a given directory.
     * Use lambda expression instead of a File Filter object.
     * Repeat with a method expression
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(QuestionTwo.class);

    public static void main(String[] args) {
        QuestionTwo questionTwo = new QuestionTwo();
        String userHome = System.getProperty("user.home");
        File[] subdirectories = questionTwo.getSubdirectories(userHome);
        LOGGER.info("{}", Arrays.asList(subdirectories));
        File[] subdirectories2 = questionTwo.getSubdirectories2(userHome);
        LOGGER.info("{}", Arrays.asList(subdirectories2));
    }

    public File[] getSubdirectories(String directory) {
        LOGGER.info("getting directories from {} with lambda", directory);
        return new File(directory).listFiles(pathname -> pathname.isDirectory());
    }

    public File[] getSubdirectories2(String directory) {
        LOGGER.info("getting directories from {} with method reference", directory);
        return new File(directory).listFiles(File::isDirectory);
    }
}
