package dmdev.oop.inputoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

public class InputStreamRunner {
    public static void main(String[] args) throws IOException {
       // File file = new File(String.join(File.separator, "myfile", "newFile.txt"));
        File file = Path.of("src","myfile", "newFile.txt").toFile();
        try(FileInputStream stream = new FileInputStream(file)){
            byte[] bytes = stream.readAllBytes();
            String stringValue = new String(bytes);
            System.out.println(stringValue);

        }
    }
}
