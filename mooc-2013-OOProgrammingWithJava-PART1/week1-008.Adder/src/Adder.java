
import java.sql.SQLOutput;
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.print("Type a number: ");
        int a = reader.nextInt();
        System.out.print("Type another number: ");
        int b = reader.nextInt();
        System.out.println("");
        int result = a+b;
        System.out.println("Sum of the numbers: " + result);
    }
}
