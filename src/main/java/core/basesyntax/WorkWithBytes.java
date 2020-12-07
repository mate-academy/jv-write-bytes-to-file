package core.basesyntax;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        File file;
        file = new File(fileName);
        for (Byte oneByte : data) {
            try (FileOutputStream fileOutputStream = new FileOutputStream(file, true)) {
                fileOutputStream.write(oneByte);
            } catch (IOException e) {
                throw new RuntimeException("Can't write data to file!", e);
            }
        }
    }
}
