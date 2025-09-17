import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("1.Addition(+)\n2.Substraction(-)\n3.Multiplication(*)\n4.Division(/)\nChoose the operation:");
        int op = sc.nextInt();
        switch (op){
            case 1:
                System.out.println("Sum = "+ (num1 + num2));
                break;
            case 2:
                System.out.println("Difference = "+ (num1 - num2));
                break;
            case 3:
                System.out.println("Product = "+ (num1 * num2));
                break;
            case 4:
                System.out.println("Division = "+ (num1 / num2));
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
