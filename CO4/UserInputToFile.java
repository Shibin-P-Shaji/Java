import java.io.*;
import java.util.Scanner;

public class UserInputToFile {
    public static void main(String[] args) {
        String filename = "user_input.txt";

        // Step 1: Read 3 lines from user
        Scanner sc = new Scanner(System.in);
        String[] lines = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter line " + (i + 1) + ": ");
            lines[i] = sc.nextLine();
        }

        // Step 2: Write lines to file
        try (PrintWriter pw = new PrintWriter(new FileWriter(filename))) {
            for (String line : lines) {
                pw.println(line);
            }
            System.out.println("Wrote input to " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file.");
            e.printStackTrace();
        }

        // Step 3: Read file and display contents
        System.out.println("Reading file contents:");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }
    }
}
