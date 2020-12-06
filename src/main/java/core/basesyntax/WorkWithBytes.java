package core.basesyntax;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        File file = new File(fileName);

        try {
            Files.write(Paths.get(fileName), data);
        } catch (IOException e) {
            throw new RuntimeException("Can't write data to file " + fileName, e);
        }
    }
}
