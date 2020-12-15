package core.basesyntax;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        try (BufferedWriter writeFile = new BufferedWriter(new FileWriter(fileName))) {
            for (byte singleByte : data) {
                writeFile.write(singleByte);
            }
        } catch (IOException e) {
            throw new RuntimeException("Can't create a file!" + fileName, e);
        }
    }
}
