import java.util.Scanner;
public class AreaAndPerimeter {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter length:");
        float length = myObj.nextFloat();
        System.out.println("Enter breadth:");
        float breadth = myObj.nextFloat();
        float area,perimeter;
        area = length * breadth;
        perimeter = 2 * (length + breadth);
        System.out.println("Area of Rectangle: " + area);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}
