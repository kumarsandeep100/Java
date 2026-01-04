

public class BankAccount {

  private int balance = 1000;

  public void deposit(int amount){
    if(amount > 0){
      balance +=  amount;
    }
    else{
      System.out.println("Invalid amount");
    }
  }



public void withdraw(int amount){
  if(amount<=0){
    System.out.println("Invalid amount");
  }
  else if(amount > balance){
    System.out.println("Insufficient balance");
  }
  else{
    balance -= amount;
  }
}

  public int getBalance(){
    return balance;
  }

  
}
// class Main{
//   public static void main(String[] args) {
//     BankAccount b = new BankAccount();
//     b.deposit(500);
//     b.withdraw(300);
//     System.out.println("Balance: "+b.getBalance());
//   }
// }