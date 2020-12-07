package core.basesyntax;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) throws IOException {
        try {
            Path path = Paths.get(fileName);
            Files.write(path, data);
        } catch (IOException e) {
            throw new IOException("Can't write data to " + fileName + ", " + e);
        }
    }
}
