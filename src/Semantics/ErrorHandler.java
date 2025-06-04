package src.Semantics;

import java.io.FileWriter;
import java.io.IOException;

public class ErrorHandler {
    public static void logError(UndefinedPropertyException exception) {
        String message = "Semantic Error: '" + exception.getPropertyName() +
                "' is not defined (line " + exception.getLineNumber() + ")\n";
        try (FileWriter writer = new FileWriter("error_log.txt", true)) {
            writer.write(message);
        } catch (IOException e) {
            System.err.println("Failed to write to error_log.txt: " + e.getMessage());
        }
    }
}