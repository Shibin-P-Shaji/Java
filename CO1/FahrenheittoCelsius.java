import java.util.Scanner;

public class FahrenheittoCelsius {
    public static void main(String[] args) {
        //(F − 32) × 5/9
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = myObj.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + celsius);
    }
}
