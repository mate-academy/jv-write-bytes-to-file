package core.basesyntax;

import java.io.FileOutputStream;
import java.io.IOException;

public class WorkWithBytes {

    public void writeBytesToFile(String fileName, byte[] data) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            fileOutputStream.write(data);
        } catch (IOException e) {
            throw new RuntimeException("Can't create file");
        }
    }
}

