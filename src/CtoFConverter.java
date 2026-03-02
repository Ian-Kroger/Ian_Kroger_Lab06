import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");

        if (in.hasNextDouble()) {
            double celsius = in.nextDouble();
            double fahrenheit = (9.0 / 5.0) * celsius + 32;
            System.out.println(fahrenheit);
        } else {
            System.out.println("Bad Input");
        }

        in.close();
    }
}