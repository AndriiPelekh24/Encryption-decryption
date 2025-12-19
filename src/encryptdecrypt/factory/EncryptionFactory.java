package encryptdecrypt.factory;

import encryptdecrypt.strategy.EncryptionStrategy;
import encryptdecrypt.strategy.ShiftStrategy;
import encryptdecrypt.strategy.UnicodeStrategy;
import encryptdecrypt.types.ENCRYPTION_TYPE;

public class EncryptionFactory {
    public static EncryptionStrategy createStrategy(ENCRYPTION_TYPE encryptionType) {
        switch (encryptionType) {
            case UNICODE:
                return new UnicodeStrategy();
            case SHIFT:
                return new ShiftStrategy();
            default:
                return new ShiftStrategy();
        }
    }

}
