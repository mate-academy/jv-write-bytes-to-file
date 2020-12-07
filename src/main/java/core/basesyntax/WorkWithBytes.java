package core.basesyntax;

import java.io.*;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        File fileToWrite = new File(fileName);
        try (FileOutputStream fos = new FileOutputStream(fileToWrite)) {
            for (byte dataLine : data) {
                fos.write(dataLine);
            }
        } catch (IOException e) {
            throw new RuntimeException("File "
                    + fileToWrite.getName() + " couldn't be written", e);
        }
    }
}
