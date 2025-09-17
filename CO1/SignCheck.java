import java.util.Scanner;

public class SignCheck {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double value = myObj.nextDouble();
        if (value > 0){
            System.out.print("The entered value is positive.");
        } else if (value < 0) {
            System.out.print("The entered value is negative.");
        }else{
            System.out.print("The entered value is zero.");
        }
    }
}
