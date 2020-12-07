package core.basesyntax;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {

        try {
            Files.write(Path.of(fileName), data);
        } catch (IOException e) {
            throw new RuntimeException("Can't write data to file " + fileName, e);
        }

    }
}
