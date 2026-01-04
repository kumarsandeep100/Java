public class EvenOddCountArray {

  static void countEvenOdd(int[] arr){
    int evenSum = 0;
    int oddSum = 0;
    for(int i = 0;i<arr.length;i++){
      if(arr[i]%2==0){
        evenSum++;
      }
      else{
        oddSum++;
      }
    }

    System.out.println("Even: "+evenSum);
    System.out.println("Odd: "+oddSum);
  }

  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,0};
    countEvenOdd(arr);
  }

  
}
