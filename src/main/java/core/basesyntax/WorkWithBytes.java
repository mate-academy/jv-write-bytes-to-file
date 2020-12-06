package core.basesyntax;

import java.io.FileOutputStream;
import java.io.IOException;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        try (FileOutputStream out = new FileOutputStream(fileName)) {
            out.write(data);
        } catch (IOException e) {
            throw new RuntimeException("Problem to write file", e);
        }
    }
}
