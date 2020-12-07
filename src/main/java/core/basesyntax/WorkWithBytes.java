package core.basesyntax;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        File file = new File(fileName);
        for (byte bytes: data) {
            try (BufferedWriter bufferedWriter
                         = new BufferedWriter(new FileWriter(fileName, true))) {
                bufferedWriter.write(bytes);
            } catch (IOException e) {
                throw new RuntimeException("Can't write data to file - " + fileName, e);
            }
        }
    }
}

