package core.basesyntax;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        try (FileOutputStream writeToFile = new FileOutputStream(fileName)) {
            writeToFile.write(data);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Can't creates a file output stream", e);
        } catch (IOException e) {
            throw new RuntimeException("Can't write data to file", e);
        }
    }
}
