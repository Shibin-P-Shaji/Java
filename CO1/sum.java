import java.util.Scanner;
public class sum {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int num1 = myObj.nextInt();
        System.out.println("Enter Second Number:");
        int num2 = myObj.nextInt();
        int sum;
        sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }
}
