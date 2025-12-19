package encryptdecrypt.tests;

import encryptdecrypt.file.FileHandler;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import java.nio.file.Path;

public class FileHandlerUnitTest {

    @Test
        void readAndWriteFileTest(@TempDir Path file) throws IOException {
        String mock = "James Bond";
        Path test = file.resolve("test.txt");
        FileHandler.writeFile(String.valueOf(test), mock);
        String res = FileHandler.readFile(String.valueOf(test));

        assertEquals(mock, res);
    }
}
