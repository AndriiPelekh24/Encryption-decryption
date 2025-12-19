package encryptdecrypt;
import encryptdecrypt.context.EncryptionContext;
import encryptdecrypt.types.ENCRYPTION_TYPE;
import encryptdecrypt.file.FileHandler;

public class Main {
    public static void main(String[] args) {
        String mode = "enc";
        int key = 0;
        String data = null;
        String inputFile = null;
        String outputFile = null;
        String algorithm = "shift";

        for (int i = 0; i < args.length - 1; i += 2) {
            switch (args[i]) {
                case "-mode":
                    mode = args[i + 1];
                    break;
                case "-key":
                    key = Integer.parseInt(args[i + 1]);
                    break;
                case "-data":
                    data = args[i + 1];
                    break;
                case "-in":
                    inputFile = args[i + 1];
                    break;
                case "-out":
                    outputFile = args[i + 1];
                    break;
                case "-alg":
                    algorithm = args[i + 1];
                    break;
            }
        }

        String message = "";
        if (data != null) {
            message = data;
        } else if (inputFile != null) {
            message = FileHandler.readFile(inputFile);
            if (message == null) return;
        }

        EncryptionContext context = new EncryptionContext();
        context.setStrategy(ENCRYPTION_TYPE.fromString(algorithm));

        String result = mode.equals("dec") ?
                context.decrypt(message, key) :
                context.encrypt(message, key);

        if (outputFile != null) {
            FileHandler.writeFile(outputFile, result);
        } else {
            System.out.println(result);
        }
    }
}