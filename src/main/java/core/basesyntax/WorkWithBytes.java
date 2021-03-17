package core.basesyntax;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        File newFile = new File(fileName);
        try (BufferedWriter bufferWriter = new BufferedWriter(new FileWriter(newFile))) {
            for (byte item: data) {
                bufferWriter.write(item);
            }
        } catch (IOException e) {
            throw new RuntimeException("Can`t write to a file", e);
        }
    }
}
