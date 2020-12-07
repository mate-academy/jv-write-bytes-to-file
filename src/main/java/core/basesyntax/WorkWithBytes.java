package core.basesyntax;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        File file = new File(fileName);
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            fileOutputStream.write(data);
        } catch (FileNotFoundException e) {
            System.out.println("Can't write to the file");
        } catch (IOException e) {
            System.out.println("Can't write to the file");
        }
    }
}
