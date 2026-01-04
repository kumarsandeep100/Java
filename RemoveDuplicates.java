public class RemoveDuplicates {

  public static void main(String[] args) {
    int[] arr = {1,2,3,4,4,5,5};

    for(int i = 0 ;i<arr.length;i++){

      boolean lastSeen = false;
      for(int k  =0;k<i;k++){

        if(arr[i]==arr[k]){
          lastSeen = true;
          break;
        }
      

      }
        if(!lastSeen){
          System.out.print(arr[i]+" ");
        }



    }
    
  
   
   
  }
  
}
