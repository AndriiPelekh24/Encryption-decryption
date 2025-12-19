package encryptdecrypt.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class FileHandler {

    public static String readFile(String inputFile) {
        try {
            File file = new File(inputFile);
            Scanner scanner = new Scanner(file);
            StringBuilder sb = new StringBuilder();
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine());
                if (scanner.hasNextLine()) sb.append("\n");
            }
            scanner.close();
            return sb.toString();
        } catch (IOException e) {
            System.out.println("Error: Cannot read file " + inputFile);
            return null;
        }
    }

    public static void writeFile(String outputFile, String data) {
        try {
            FileWriter writer = new FileWriter(outputFile);
            writer.write(data);
            writer.close();
        } catch (IOException e) {
            System.out.println("Error: Cannot write file " + outputFile);
        }
    }
}