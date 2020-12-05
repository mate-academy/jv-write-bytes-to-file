package core.basesyntax;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        File fileTo = new File(fileName);
        try {
            Files.write(fileTo.toPath(), data);
        } catch (IOException e) {
            throw new RuntimeException("Can not write to file");
        }
    }
}
