public class FindDuplicates {

  public static void main(String[] args) {

    int[] arr = {1,2,1,2,3,4,5,1,2,};

    int count = 0;


    for(int i = 0; i<arr.length;i++){
      count = 0;
      for(int j = 0 ; j<arr.length;j++){
        if(arr[i]==arr[j]){
          count++;
        }
      }

      if(count>1){
        boolean alreadySeen = false;
        for(int k = 0;k<i;k++){
          if(arr[i]==arr[k]){
            alreadySeen  = true;
            break;
          }
        }

        if(!alreadySeen){
          System.out.println(arr[i]);

        }
       
      }

      
    }

  
    


  }






}

