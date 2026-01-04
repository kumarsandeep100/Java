import java.util.Scanner;

public class NumberSignChecker {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        if (num < 0) {
            System.out.println("The number is negative.");
        } else if (num == 0) {
            System.out.println("The number is zero.");
        } else {
            System.out.println("The number is positive.");
        }

        scan.close(); 
    }
}
