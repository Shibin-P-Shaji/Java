import java.io.*;

public class PrintWriterDemo {
    public static void main(String[] args) {
        String filename = "report.txt";

        // Write formatted output to file
        try (PrintWriter pw = new PrintWriter(new FileWriter(filename))) {
            pw.println("Report Title: Student Scores");
            pw.printf("Student %d: Score = %d%n", 1, 85);
            pw.printf("Student %d: Score = %d%n", 2, 93);
            System.out.println("Data written to " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Read back contents to show
        System.out.println("\nThe file " + filename + " contents:\n");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
