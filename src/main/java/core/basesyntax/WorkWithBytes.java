package core.basesyntax;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        try {
            Files.write(Path.of(fileName), data);
        } catch (IOException e) {
            throw new RuntimeException("Can't write data to file " + Path.of(fileName), e);
        }
    }

    private File createFile(String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException("Can't create file" + file, e);
        }
        return file;
    }
}
