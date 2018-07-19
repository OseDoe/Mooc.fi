
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.print("Type a number: ");
        int firstNumber = reader.nextInt();
        System.out.print("Type another number: " );
        int secondNumber = reader.nextInt();
        float result = (float)firstNumber / (float)secondNumber;

        System.out.println("\nDivision: " + firstNumber + " / " + secondNumber + " = " + result);
    }
}
