package core.basesyntax;

import java.io.FileOutputStream;
import java.io.IOException;

public class WorkWithBytes {

    public void writeBytesToFile(String fileName, byte[] data) {
        try (FileOutputStream writer = new FileOutputStream(fileName)) {
            for (byte piece: data) {
                writer.write(piece);
            }
        } catch (IOException e) {
            throw new RuntimeException("Can't write to file", e);
        }
    }
}
