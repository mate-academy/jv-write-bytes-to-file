package core.basesyntax;

import java.io.FileOutputStream;
import java.io.IOException;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        try (FileOutputStream writeToFile = new FileOutputStream(fileName)) {
            writeToFile.write(data);
        } catch (IOException e) {
            throw new RuntimeException("Can't write data to file");
        }
    }
}



