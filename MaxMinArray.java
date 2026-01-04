public class MaxMinArray {

  static void findMaxMin(int[] arr){
    int min = arr[0];
    int max = arr[0];
    
    for(int i = 1; i< arr.length;i++){
      if(arr[i]>=max){
        max = arr[i];
      }
      if(arr[i]<=min){
        min = arr[i];
      }
    }

    System.out.println("Max: "+max);
    System.out.println("Min: "+min);
  }

  public static void main(String[] args) {
    int[] arr = {1,2,3,4,4,5,7,7,1,0,8};
    findMaxMin(arr);
  }

  
}
