package encryptdecrypt.tests;

import encryptdecrypt.factory.EncryptionFactory;
import encryptdecrypt.strategy.EncryptionStrategy;
import encryptdecrypt.strategy.ShiftStrategy;
import encryptdecrypt.strategy.UnicodeStrategy;
import encryptdecrypt.types.ENCRYPTION_TYPE;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EncryptionFactoryUnitTest {

    @Test
    public void createShiftStrategy() {
        EncryptionStrategy strategy = EncryptionFactory.createStrategy(ENCRYPTION_TYPE.SHIFT);
        assertInstanceOf(ShiftStrategy.class, strategy);
    }

    @Test
    public void createUnicodeStrategy() {
        EncryptionStrategy strategy = EncryptionFactory.createStrategy(ENCRYPTION_TYPE.UNICODE);
        assertInstanceOf(UnicodeStrategy.class, strategy);
    }
}