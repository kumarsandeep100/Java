public class CountFrequencyOfCharacters {

  public static void main(String[] args) {

    String s = "Hello World";
    s = s.toLowerCase().replace(" ", "");

    int count = 0;

    for(int i = 0 ;i<s.length();i++){
      count = 0;
      for(int j = 0;j<s.length();j++){
        if(s.charAt(i)==s.charAt(j)){
          count++;
        }
      }

      boolean repeatCount = false;
      for(int k = 0; k<i;k++){
        if(s.charAt(i)==s.charAt(k)){
          repeatCount = true;
          break;
        }
      }
      if(!repeatCount){
        System.out.println(s.charAt(i)+" -> " +count);
      }

    }
    




  }
  
}
