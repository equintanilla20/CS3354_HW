package hw2.q4;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

public class QuestionFour {
    /*
        4. File Information Collector
        Design and write a Java code that captures the meta-data of all files in a directory and capture
        the following information:
        1) size of file
        2) when it was created,
        3) when it was last modified,
        4) is the file text or binary.
        Hint: First look the root File and get its metadata using the File Object (as discussed in the class)
     */

    private void listAll(File[] files) {
        for (File filename : files) {
            if (filename.isDirectory()) {
                // Print info
                System.out.println("\n-----\nDirectory: " + filename.getName());
                if (Objects.requireNonNull(filename.listFiles()).length == 0) {
                    System.out.println("EMPTY");
                }
                listAll(Objects.requireNonNull(filename.listFiles()));
            } else {
                printFileInfo(filename);
            }
        }
    }

    private void printFileInfo(File fn) {
        Path file = Paths.get(fn.getPath());
        String extension = "";
        int i = fn.getName().lastIndexOf(".");

        if (i > 0) {
            extension = fn.getName().substring(i + 1);
        }

        try {
            BasicFileAttributes attributes = Files.readAttributes(file, BasicFileAttributes.class);
            System.out.println("\nFile: " + fn.getName());
            System.out.println("Size: " + fn.length() + " bytes");
            System.out.println("Created: " + attributes.creationTime());
            System.out.println("Last Modified: " + attributes.lastModifiedTime());
            System.out.println("Type: " + extension);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getRootThenList() {
        String windowsPath = "C:\\Users\\eqdev\\Documents\\dev\\";
        String root = windowsPath + "CS3354_HW\\src\\hw2\\q4\\rootDir";
        File[] files = new File(root).listFiles();
        System.out.println("Root: " + root);
        listAll(Objects.requireNonNull(files));
    }
}