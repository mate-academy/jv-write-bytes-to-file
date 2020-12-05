package core.basesyntax;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        File file = createFile(fileName);
        try {
            Files.write(file.toPath(), data);
        } catch (IOException e) {
            throw new RuntimeException("Can't write data to file " + file, e);
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
