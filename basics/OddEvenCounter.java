import java.util.Scanner;

public class OddEvenCounter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int numsEntered = scan.nextInt();

        int evenNums = 0;
        int oddNums = 0;

        for (int i = 1; i <= numsEntered; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                evenNums++;
            } else {
                oddNums++;
            }
        }

        System.out.println("Even numbers: " + evenNums);
        System.out.println("Odd numbers: " + oddNums);

        scan.close(); 
    }
}
