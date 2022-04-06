package core.basesyntax;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        try {
            Files.write(Paths.get(fileName), data);
        } catch (IOException e) {
            throw new RuntimeException("Can't write to the file " + fileName, e);
        }
    }
}
