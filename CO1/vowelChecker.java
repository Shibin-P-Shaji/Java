import java.util.Scanner;

public class vowelChecker {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = myObj.next().toLowerCase().charAt(0);
        if (( character >= 'a' && character <= 'z')){
            if (character == 'a' || character== 'e' || character =='i' || character == 'o' || character == 'u'){
                System.out.print(character + " is vowel ");
            }else{
                System.out.print(character + " is Consonant ");
            }
        }else {
            System.out.print("Enter a valid character between a-z");
        }

    }
}
