import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class buffer {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        System.out.println("Please enter a line of text:");

        String line = null;
        try {
            line = reader.readLine();
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
            return;
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing reader: " + e.getMessage());
            }
        }

        if (line != null && !line.trim().isEmpty()) {
            String[] words = line.trim().split("\\s+");
            System.out.println("Number of words: " + words.length);
        } else {
            System.out.println("No words entered or the input was empty.");
        }
    }
}

