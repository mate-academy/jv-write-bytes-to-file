package core.basesyntax;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        File file = new File(fileName);
        try {
            FileOutputStream byteInfo = new FileOutputStream(file);
            byteInfo.write(data);
        } catch (IOException e) {
            throw new RuntimeException("This file can't exist", e);
        }
    }
}
