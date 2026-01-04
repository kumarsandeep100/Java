public class SearchElementArray {

  static int search(int[] arr, int target){

    for(int i = 0; i<arr.length;i++){
      if(arr[i]==target){
        return i;

      }
    }
    return -1;

  }

  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    int target = 11;
    System.out.println(search(arr, target)); 
  }

  
}
