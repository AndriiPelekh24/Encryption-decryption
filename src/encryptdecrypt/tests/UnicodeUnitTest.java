package encryptdecrypt.tests;

import encryptdecrypt.strategy.UnicodeStrategy;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
public class UnicodeUnitTest {
   private UnicodeStrategy unicodeStrategy;

   @BeforeEach
    void setUp() {
       this.unicodeStrategy = new UnicodeStrategy();
   }

    @ParameterizedTest
    @CsvSource({
            "abc, 3, def",
            "hello, 5, mjqqt"
    })
    void testEncryption(String input, int key, String expected) {
       String result = unicodeStrategy.encrypt(input, key);
       assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "def, 3, abc",
            "mjqqt, 5, hello"
    })
    void testDecryption(String input, int key, String expected) {
        String result = unicodeStrategy.decrypt(input, key);
        assertEquals(expected, result);
    }

    @Test
    void testEncryptDecryptSymmetry() {
        String original = "Hello World";
        String encrypted = unicodeStrategy.encrypt(original, 5);
        String decrypted = unicodeStrategy.decrypt(encrypted, 5);

        assertEquals(original, decrypted);
    }
}
