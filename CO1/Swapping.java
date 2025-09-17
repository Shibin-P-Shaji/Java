import java.util.Scanner;
class Swapping{
public static void main(String[] args){
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter First Number:");
    int a = myObj.nextInt();
    System.out.println("Enter Second Number:");
    int b = myObj.nextInt();
    int temp = 0;
    System.out.println("Before Swapping:");
    System.out.println("a: " + a);
    System.out.println("b: " + b);
    temp = a;
    a = b;
    b = temp;
    System.out.println("After Swapping:");
    System.out.println("a: " + a);
    System.out.println("b: " + b);
    }
}