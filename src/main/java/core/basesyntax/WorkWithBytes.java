package core.basesyntax;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        File file = new File(fileName);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (byte bt : data) {
                bufferedWriter.write(bt);
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException("Can't write to file " + fileName, e);
        }

    }
}
