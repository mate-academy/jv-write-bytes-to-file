package core.basesyntax;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            for (byte potentialChar : data) {
                bufferedWriter.write(potentialChar);
            }
        } catch (IOException e) {
            throw new RuntimeException("We have a problam with file " + fileName, e);
        }
    }
}
