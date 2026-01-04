

interface Payment {

  void pay();
}
class CreditCard implements Payment{
  public void pay(){
    System.out.println("Payment via Credit Card");
  }

  public static void main(String[] args) {
    Payment p = new CreditCard();
    p.pay();
  }
}