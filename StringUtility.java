import java.util.Scanner;

public class StringUtility {

  static void revString(String s){
    String revsString = "";
    for(int i = 0; i<s.length();i++){
      char ch = s.charAt(i);
      revsString = ch + revsString;
    }
    System.out.println(revsString);
  }

  static void checkPalindrome(String s){
    s = s.toLowerCase().replace(" ", "");
    String revString = "";
    for(int i = 0; i<s.length();i++){
      char ch = s.charAt(i);
      revString = ch + revString;
    }
    if(s.equals(revString)){
      System.out.println("Palindrome");
    }
    else{
      System.out.println("Not Palindrome");
    }
  }

  static void countVowels(String s){
    int count = 0;
    s = s.toLowerCase();
    for(int i = 0;i<s.length();i++){
      char ch = s.charAt(i);
      if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
        count++;
      }
      
    }

    System.out.println("Vowels: "+count);
  }



  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String s = scan.nextLine();

    while (true) {

      System.out.println("1. Reverse String");
      System.out.println("2. Check Palindrome");
      System.out.println("3. Count Vowels");
      System.out.println("4. Exit");

      System.out.println("Enter choice: ");
      int choice = scan.nextInt();

      switch(choice){
        case 1:
          revString(s);
          break;
        case 2:
          checkPalindrome(s);
          break;
        case 3:
          countVowels(s);
          break;
        case 4:
          System.out.println("Thank you!");
          scan.close();
          return;
        default:
          System.out.println("Invalid Entry");
      }

      
    }
  }
  
}
