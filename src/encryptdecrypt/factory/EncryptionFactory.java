package encryptdecrypt.factory;

import encryptdecrypt.strategy.EncryptionStrategy;
import encryptdecrypt.strategy.ShiftStrategy;
import encryptdecrypt.strategy.UnicodeStrategy;

public class EncryptionFactory {
    public static EncryptionStrategy createStrategy(String algorithmType) {
        switch (algorithmType.toLowerCase()) {
            case "unicode":
                return new UnicodeStrategy();
            case "shift":
                return new ShiftStrategy();
            default:
                return new ShiftStrategy();
        }
    }

}
