package encryptdecrypt.context;

import encryptdecrypt.factory.EncryptionFactory;
import encryptdecrypt.strategy.EncryptionStrategy;
import encryptdecrypt.types.ENCRYPTION_TYPE;

public class EncryptionContext {
    private EncryptionStrategy strategy;

    public void setStrategy(ENCRYPTION_TYPE strategy) {
        this.strategy = EncryptionFactory.createStrategy(strategy);
    }

    public String encrypt(String message, int key) {
        return strategy.encrypt(message, key);
    }

    public String decrypt(String message, int key) {
        return strategy.decrypt(message, key);
    }
}
