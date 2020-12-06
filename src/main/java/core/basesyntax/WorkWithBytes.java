package core.basesyntax;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        File file = createEmptyFile(fileName);
        for (byte iterator : data) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
                bufferedWriter.write(iterator);
            } catch (IOException e) {
                throw new RuntimeException("Can't write data to file " + fileName, e);
            }
        }
    }

    public File createEmptyFile(String fileName) {
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
