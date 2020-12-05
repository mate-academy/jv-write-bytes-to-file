package core.basesyntax;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        File file = new File(fileName);
        BufferedWriter bufferedWriter = null;

        for (byte bytes: data) {
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(file, true));
                bufferedWriter.write(bytes);
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException("Can't write ti file");
            }
        }
    }
}
