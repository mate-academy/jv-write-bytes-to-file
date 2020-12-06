package core.basesyntax;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        try {
            Files.write(new File(fileName).toPath(), data);
        } catch (IOException e) {
            throw new RuntimeException("Could not write to file " + fileName, e);
        }

    }
}
