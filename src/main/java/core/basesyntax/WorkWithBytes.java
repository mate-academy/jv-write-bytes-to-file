package core.basesyntax;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WorkWithBytes {

    public void writeBytesToFile(String fileName, byte[] data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));) {
            for (byte piece: data) {
                writer.write(piece);
            }
        } catch (IOException e) {
            throw new RuntimeException("Can't write to file", e);
        }
    }
}
