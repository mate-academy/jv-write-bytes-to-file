package core.basesyntax;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        File fileToWrite = new File(fileName);
        try {
            fileToWrite.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException("File "
                    + fileToWrite.getName() + " couldn't be created", e);
        }
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileToWrite))) {
            for (byte dataLine : data) {
                bw.write(dataLine);
                bw.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException("File "
                    + fileToWrite.getName() + " couldn't be written", e);
        }
    }
}
