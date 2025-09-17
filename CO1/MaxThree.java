import java.util.Scanner;

public class MaxThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter three numbers to find the maximum:\n");
        System.out.print("First number: ");
        int a = sc.nextInt();
        System.out.print("Second number: ");
        int b = sc.nextInt();
        System.out.print("Third number: ");
        int c = sc.nextInt();

        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("The maximum number is: " + max);
    }
}
