public class DuplicateCharacter {

  public static void main(String[] args) {
    String s = "Hel   l   o W o   rld";
    s = s.toLowerCase().replace(" ", "");
    char ch;
    int count = 0;

    for(int i = 0;i<s.length();i++){
      ch = s.charAt(i);
      count = 0;
      for(int j  = 0;j<s.length();j++){
        if(ch==s.charAt(j)){
          count++;
        }
      }
      if(count>1){
        boolean repeatChar = false;
        for(int k = 0 ; k<i;k++){
          if(s.charAt(i)==s.charAt(k)){
            repeatChar = true;
            break;

          }
        }
        if(!repeatChar){
          System.out.println(ch);
        }
      }
     
    }
  }
  
}
