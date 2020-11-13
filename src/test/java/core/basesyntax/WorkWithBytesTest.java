package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WorkWithBytesTest {
    private WorkWithBytes workWithFile = new WorkWithBytes();

    @Test
    public void writeLineToFile() {
        byte[] data = {72, 101, 108, 108, 111, 32, 102, 114, 111, 109, 32, 109, 97, 116, 101, 33};
        workWithFile.writeBytesToFile("first.txt", data);
        String actualResult = readFromFile("first.txt").trim();
        String expectedResult = new String(data);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void writeTwoLinesToFile() {
        byte[] data = {45, 32, 87, 104, 97, 116, 32, 105, 115, 32, 121, 111, 117, 114, 32, 110,
                97, 109, 101, 63, 10, 45, 32, 77, 121, 32, 110, 97, 109, 101, 32, 105, 115, 32,
                74, 111, 104, 110, 115, 58, 41};
        workWithFile.writeBytesToFile("second.txt", data);
        String actualResult = readFromFile("second.txt").trim();
        String expectedResult = new String(data);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void writeLinesWithTabulationToFile() {
        byte[] data = {65, 49, 10, 9, 65, 50, 10, 9, 9, 65, 51, 10, 9, 9, 9, 65, 52};
        workWithFile.writeBytesToFile("third.txt", data);
        String actualResult = readFromFile("third.txt").trim();
        String expectedResult = new String(data);
        Assert.assertEquals(expectedResult, actualResult);
    }

    private String readFromFile(String fileName) {
        try {
            return Files.readString(Path.of(fileName));
        } catch (IOException e) {
            throw new RuntimeException("Can't correctly read data from file " + fileName, e);
        }
    }
}
