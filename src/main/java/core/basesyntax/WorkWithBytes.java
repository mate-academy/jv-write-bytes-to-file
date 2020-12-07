package core.basesyntax;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        try (OutputStream outputStream = new FileOutputStream(fileName)) {
            outputStream.write(data);
        } catch (IOException e) {
            throw new RuntimeException("Can't write bytes to file!", e);
        }
    }
}
