package encryptdecrypt.tests;

import encryptdecrypt.context.EncryptionContext;
import encryptdecrypt.types.ENCRYPTION_TYPE;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EncryptionContextUnitTest {
   private EncryptionContext encryptionContext;

   @BeforeEach
   public void setUp() {
      encryptionContext = new EncryptionContext();
   }
   @Test
    public void setStrategyTestAndEncrypt() {
       encryptionContext.setStrategy(ENCRYPTION_TYPE.SHIFT);
       String res = encryptionContext.encrypt("abc", 3);
       assertEquals("def", res);
   }
   @Test
   public void setStrategyTestAndDecrypt() {
      encryptionContext.setStrategy(ENCRYPTION_TYPE.UNICODE);
      String res = encryptionContext.decrypt("def", 3);
      assertEquals("abc", res);
   }
}
