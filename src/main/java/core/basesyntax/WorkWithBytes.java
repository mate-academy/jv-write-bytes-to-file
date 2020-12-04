package core.basesyntax;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(new File(fileName))) {
            fileOutputStream.write(data);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Can't find file with this name!", e);
        } catch (IOException e) {
            throw new RuntimeException("Can't write data to this file!", e);
        }
    }
}
