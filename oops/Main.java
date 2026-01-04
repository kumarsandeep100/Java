import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int amount;
    BankAccount b = new BankAccount();
    
    Scanner scan = new Scanner(System.in);
    while(true){
      System.out.println("1 Check Balance");
      System.out.println("2 Deposit");
      System.out.println("3 Withdrawal");
      System.out.println("4 Exit");
      int choice = scan.nextInt();


      switch(choice){
        case 1:
          System.out.println("Balance: "+b.getBalance());
          break;

        case 2:
          System.out.println("Enter amount: ");
          amount = scan.nextInt();
          b.deposit(amount);
          break;
        
        case 3:
          System.out.println("Enter amount: ");
          amount = scan.nextInt();
          b.withdraw(amount);
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
