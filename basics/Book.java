class Book{
  private String title;
  private double price;

  Book(String title, double price){
    this.title = title;
    this.price = price;

  }

  void display(){
    System.out.println("Title: "+title+", Price: $"+price);
  }

public static void main(String[] args) {

  Book[] book = new Book[3];
  book[0] = new Book("Earth is Good", 11.2);
  book[1] = new Book("Our Cities",12.1);
  book[2] = new Book("Cold Bucket",5);

  for(Book b: book){
    b.display();
  }



  
}
 

}