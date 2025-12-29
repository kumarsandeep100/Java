import java.util.Scanner;
class SumOfDigits{
  static int sumOfDigits(int num){

    int temp = num;
    int sum = 0;
    while(temp!=0){

      sum +=  temp%10;
      temp /= 10;

    }
    return sum;

  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number: ");
    System.out.println("Output: "+sumOfDigits(scan.nextInt()));
    scan.close();
  }
}