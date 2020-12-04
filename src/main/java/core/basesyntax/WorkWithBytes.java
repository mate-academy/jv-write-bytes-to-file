package core.basesyntax;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        try (BufferedWriter writeFile = new BufferedWriter(new FileWriter(fileName))) {
            for (byte bytes : data) {
                writeFile.write(bytes);
            }
        } catch (IOException e) {
            throw new RuntimeException("Can't create a file!" + fileName, e);
        }
    }
}
