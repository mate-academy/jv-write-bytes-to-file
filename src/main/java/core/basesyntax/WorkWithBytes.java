package core.basesyntax;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        File file = createEmptyFile(fileName);
        try (FileOutputStream fileOutputStream = new FileOutputStream(new File(fileName), true)) {
            for (byte iterator : data) {
                fileOutputStream.write(iterator);
            }
        } catch (IOException e) {
            throw new RuntimeException("Can't write data to file " + fileName, e);
        }
    }

    private File createEmptyFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException("Can't create file ", e);
            }
        }
        return file;
    }
}
