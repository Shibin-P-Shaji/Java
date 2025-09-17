import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Principle Amount:");
        float P = myObj.nextFloat();
        System.out.println("Enter Rate:");
        float R = myObj.nextFloat();
        System.out.println("Enter Time in year:");
        float T = myObj.nextFloat();
        float ST = 0f;
        ST = (P * R * T)/100;
        System.out.println("The simple interest:" + ST);
    }
}
