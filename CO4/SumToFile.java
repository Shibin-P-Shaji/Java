import java.io.*;
import java.util.Scanner;

public class SumToFile {
    public static void main(String[] args) {
        String filename = "sum.txt";
        Scanner sc = new Scanner(System.in);

        // Step 1: Read 5 integers
        System.out.print("Enter 5 integers: ");
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += sc.nextInt();
        }

        // Step 2: Write sum to file
        try (PrintWriter pw = new PrintWriter(new FileWriter(filename))) {
            pw.println(sum);
            System.out.println("Sum written to " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file.");
            e.printStackTrace();
        }

        // Step 3: Read sum back from file
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine();
            System.out.println("Sum read from file: " + line);
        } catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }
    }
}
