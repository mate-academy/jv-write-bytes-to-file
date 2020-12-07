package core.basesyntax;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WorkWithBytes {

    public void writeBytesToFile(String fileName, byte[] data) {
        File newFile = new File(fileName);
        try {
            boolean success = newFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException("Can't create file", e);
        }
        for (Byte newByte : data) {
            try (BufferedWriter bufferedWriter
                         = new BufferedWriter(new FileWriter(newFile, true))) {
                bufferedWriter.write(newByte);
            } catch (IOException e) {
                throw new RuntimeException("Can't write data to file", e);
            }
        }
    }
}
