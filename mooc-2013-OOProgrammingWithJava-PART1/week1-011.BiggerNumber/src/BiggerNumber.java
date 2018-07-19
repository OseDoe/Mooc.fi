
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int numberOne = reader.nextInt();
        System.out.print("Type another number: ");
        int numberTwo = reader.nextInt();
        int result = Math.max(numberOne, numberTwo);
        System.out.println("The bigger number of the two number given was: " + result);
    }
}
