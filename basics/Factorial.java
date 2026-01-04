import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scan.nextInt();

        if (num < 0 || num > 20) {
            System.out.println("Number should be between 0 and 20");
        } else {
            long total = 1;
            for (int i = num; i >= 1; i--) {
                total *= i;
            }
            System.out.println("Factorial of " + num + " is " + total);
        }

        scan.close();
    }
}
