package core.basesyntax;

import java.io.*;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        File file = new File(fileName);
        try (FileOutputStream fos = new FileOutputStream(file.getPath())) {
            fos.write(data, 0, data.length);
        } catch (IOException e) {
            throw new RuntimeException("Can't write to file " + fileName, e);
        }

    }
}
