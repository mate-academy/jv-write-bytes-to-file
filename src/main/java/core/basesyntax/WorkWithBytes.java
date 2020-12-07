package core.basesyntax;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        File file = new File(fileName);
        try (OutputStream byteStream = new FileOutputStream(file)) {
            byteStream.write(data);
        } catch (Exception e) {
            throw new RuntimeException("Can't write to file " + fileName, e);
        }
    }
}
