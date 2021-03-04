package core.basesyntax;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        File toFile = new File(fileName);
        try {
            Files.write(toFile.toPath(), data);
        } catch (IOException e) {
            throw new RuntimeException("Can`t write to the file", e);
        }
    }
}
