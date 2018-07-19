
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here
        System.out.print("Type the radius: ");
        int radius = reader.nextInt();

        double result = 2 * Math.PI * (double)radius;
        System.out.println("Circumgerence of the circle: " + result);
    }
}
