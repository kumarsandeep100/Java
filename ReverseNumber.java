import java.util.Scanner;
class ReverseNumber{
    static int reverseNumber(int num){
        int temp = num;
        int rev = 0;
        while(temp!=0){

            int rem = temp%10;
            rev = rev * 10 + rem;
            temp /= 10;

        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        System.out.println("Output: "+reverseNumber(scan.nextInt()));
        scan.close();
    }
}