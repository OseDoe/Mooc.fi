
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        double number = Integer.parseInt(reader.nextLine());
        String positive = "The number is positive.";
        String negative = "The number is not positive.";
        String result = (number > 0) ? positive : negative;
        System.out.println(result);

    }
}
