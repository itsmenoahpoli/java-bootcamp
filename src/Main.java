import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    void computeDigits(int a, int b) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first digit: ");
        int firstDigit = input.nextInt();

        System.out.println("Enter second digit: ");
        int secondDigit = input.nextInt();

        int sum = firstDigit + secondDigit;
        int difference = firstDigit - secondDigit;
        int product = firstDigit * secondDigit;
        int quotient = firstDigit / secondDigit;

        System.out.println("Sum is " + sum);
        System.out.println("Difference is " + difference);
        System.out.println("Product is " + product);
        System.out.println("Quotient is " + quotient);
    }

    void getCurrentFormattedDate() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/d/YYYY hh:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        System.out.println("Today is " + dateTimeFormatter.format(now));
    }

    void getHigherInt(int a, int b) {
        if (a > b) {
            System.out.println(a + " is higher than " + b);
        } else {
            System.out.println(b + " is higher than " + a);
        }
    }

    void printSquare(int height, int width) {
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

        // main.getHigherInt(5, 100);
        // main.computeDigits();
        // main.getCurrentFormattedDate();
        main.printSquare(5,5);
    }
}