import java.io.File;
import java.util.Scanner;

public class FileExistenceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for filename
        System.out.print("Enter the filename: ");
        String filename = scanner.nextLine();

        // Create File object
        File file = new File(filename);

        // Print details
        System.out.println("File name: " + file.getName());
        System.out.println("File exists: " + file.exists());
        System.out.println("Absolute path: " + file.getAbsolutePath());

        scanner.close();
    }
}
