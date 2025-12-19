package encryptdecrypt.tests;

import encryptdecrypt.strategy.ShiftStrategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ShiftUnitTest {
    private ShiftStrategy shiftStrategy;

    @BeforeEach
    void setUp() {
        shiftStrategy = new ShiftStrategy();
    }

    @ParameterizedTest
    @CsvSource({
            "abc, 3, def",
            "ABC, 3, DEF",
            "XYZ, 3, ABC",
            "a1b2c!, 1, b1c2d!",
            "'', 1, ''"
    })
    void testEncryption(String input, int key, String expected) {
        String result = shiftStrategy.encrypt(input, key);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "def, 3, abc",
            "DEF, 3, ABC",
            "abc, 3, xyz",
            "b1c2d!, 1, a1b2c!"
    })
    void testDecryption(String input, int key, String expected) {
        String result = shiftStrategy.decrypt(input, key);
        assertEquals(expected, result);
    }

    @Test
    void testEncryptDecryptSymmetry() {
        String original = "Hello World";
        String encrypted = shiftStrategy.encrypt(original, 5);
        String decrypted = shiftStrategy.decrypt(encrypted, 5);

        assertEquals(original, decrypted);
    }
}