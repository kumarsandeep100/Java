public class StrongNumber {

  static boolean isStrong(int num){
    int temp = num;
    int total = 0;
    while(temp!=0){
      int rem = temp%10;
      int sum = 1;
      for(int i = rem;i>=1;i--){
        sum = sum * i;
      }
      total = total + sum;
      temp /=10;
    }
    return total == num;
  }

  public static void main(String[] args) {
    if(isStrong(585)){
      System.out.println("Strong number");
    }
    else{
      System.out.println("Not Strong number");
    }
  }
  
}
