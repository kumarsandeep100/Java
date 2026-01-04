public class CountDigits {

  static int countDigits(int num){
    if(num==0){
      return 1;
    }
    int temp = num;
    int count = 0;
    while(temp!=0){
      count++;
      temp /=10;
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println("Output "+countDigits(0));
  }
  
}
