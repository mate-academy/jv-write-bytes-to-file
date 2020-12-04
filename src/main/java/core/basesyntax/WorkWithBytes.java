package core.basesyntax;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            for (byte symbol : data) {
                writer.write(symbol);
            }
        } catch (IOException e) {
            throw new RuntimeException("Can't write data to file");
        }
    }
}
