package encryptdecrypt.tests;

import encryptdecrypt.types.ENCRYPTION_TYPE;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class EncryptionTypeUnitTest {

    @ParameterizedTest
    @ValueSource(strings = {"shift", "SHIFT", "ShIfT", "sHiFt", "unknown", "random123", "", "test", "xyz"})
    public void fromStringTestShift(String string) {
        ENCRYPTION_TYPE encryptionType = ENCRYPTION_TYPE.fromString(string);
        assertSame(ENCRYPTION_TYPE.SHIFT, encryptionType);
    }

    @ParameterizedTest
    @ValueSource(strings = {"unicode", "UNICODE", "UniCode", "uNiCoDe"})
    public void fromStringTestUnicode(String string) {
        ENCRYPTION_TYPE encryptionType = ENCRYPTION_TYPE.fromString(string);
        assertSame(ENCRYPTION_TYPE.UNICODE, encryptionType);
    }

    @Test
    public void testGetValueShift() {
        assertEquals("shift", ENCRYPTION_TYPE.SHIFT.getValue());
    }

    @Test
    public void testGetValueUnicode() {
        assertEquals("unicode", ENCRYPTION_TYPE.UNICODE.getValue());
    }
    @Test
    public void testToStringShift() {
        assertEquals("shift", ENCRYPTION_TYPE.SHIFT.toString());
    }

    @Test
    public void testToStringUnicode() {
        assertEquals("unicode", ENCRYPTION_TYPE.UNICODE.toString());
    }
}
