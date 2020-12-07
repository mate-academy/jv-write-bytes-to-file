package core.basesyntax;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        File file = new File(fileName);
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            fileOutputStream.write(data);
        } catch (IOException e) {
            throw new RuntimeException("The file was not written", e);
        }
    }
}
