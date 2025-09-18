import java.io.*;

public class FileWriteReadDemo {
    public static void main(String[] args) {
        String filename = "welcome.txt";

        // Write to file
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Welcome to Java File I/O!");
            System.out.println("Wrote to file: " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Read from file
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            System.out.println("Reading from file: " + filename);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("From file: " + line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
