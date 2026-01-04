

class Demo{
  void checkMarks(int marks){
    if(marks<40){
      throw new ArithmeticException("Fail");
    }
    else{
      System.out.println("Pass");
    }
  }
  public static void main(String[] args) {
    Demo d = new Demo();
    d.checkMarks(44);
  }
}