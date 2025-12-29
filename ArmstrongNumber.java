import java.util.Scanner;
class ArmstrongNumber{

  static boolean isArmstrong(int num){
    if(num==0){
      return true;
    }
    int temp = num;
    int count = 0;
    int total = 0 ;
    while(temp!=0){
      count++;
      temp /=10;
    }
    temp = num;

    while (temp!=0) {
      

      int rem = temp%10;
      int sum = 1;
      for(int i =0;i<count;i++){

        sum = sum * rem;


      }
      total = total + sum;
      temp /= 10;
      
    }

    return total == num;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number: ");
    int num = scan.nextInt();

    if(isArmstrong(num)){
      System.out.println("Armstrong");
    }
    else{
      System.out.println("Not Armstrong");
    }
    scan.close();
  }

}