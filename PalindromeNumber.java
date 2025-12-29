import java.util.Scanner;
public class PalindromeNumber {
  static boolean isPalindrome(int num){
    int temp = num;
    int rev = 0;
    while(temp!=0){
      int rem = temp%10;
      rev = rev * 10 + rem;
      temp /= 10;
    }
    return num == rev;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number: ");
    int num = scan.nextInt();
    if(isPalindrome(num)){
      System.out.println("Palindrome");
    }
    else{
      System.out.println("Not palindrome");
    }
    scan.close();
  }
}
