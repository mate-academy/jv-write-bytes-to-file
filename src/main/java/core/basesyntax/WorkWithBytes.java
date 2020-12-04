package core.basesyntax;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        File file = new File(fileName);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            for (byte byteFromData : data) {
                bufferedWriter.write(byteFromData);
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException("ERROR: Calm down and drink coffee for debug.", e);
        }
    }
}
