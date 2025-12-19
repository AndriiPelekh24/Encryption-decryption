package encryptdecrypt.strategy;

public interface EncryptionStrategy {
    String encrypt(String message, int key);
    String decrypt(String message, int key);
}