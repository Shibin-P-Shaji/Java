import java.util.Scanner;
class SwappingWithout{
public static void main(String[] args){
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter First Number:");
    int a = myObj.nextInt();
    System.out.println("Enter Second Number:");
    int b = myObj.nextInt();
    System.out.println("Before Swapping:");
    System.out.println("a: " + a);
    System.out.println("b: " + b);
    a = a+b;
    b = a-b;
    a = a-b;
    System.out.println("After Swapping:");
    System.out.println("a: " + a);
    System.out.println("b: " + b);
    }
}