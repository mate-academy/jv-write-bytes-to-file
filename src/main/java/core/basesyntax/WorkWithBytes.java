package core.basesyntax;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        Path path = Paths.get(fileName);
        try {
            Files.write(path, data);
        } catch (Exception e) {
            throw new RuntimeException("Can't write byte to file!");
        }
    }
}
