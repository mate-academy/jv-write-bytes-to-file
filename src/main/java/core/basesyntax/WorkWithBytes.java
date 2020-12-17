package core.basesyntax;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        try {
            File file = new File(fileName);
            Files.write(file.toPath(), data);
        } catch (IOException e) {
            System.out.println("File was not created");
        }
    }
}
