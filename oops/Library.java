public class Library {

  Book[] books = new Book[5];
  int count = 0;

  void showAllBooks(){
    if(count == 0){
      System.out.println("No books available");
    }
    else{
      for(int i = 0; i < count; i++){

        String status;
        if(books[i].isIssued){
          status = "Issued";
        }
        else{
          status = "Available";
        }

        System.out.println(
          "Id: " + books[i].id +
          ", Name: " + books[i].name +
          ", Status: " + status
        );
      }
    }
  }

  void addBook(int id, String name){
    if(count == books.length){
      System.out.println("Library full");
    }
    else{
      books[count] = new Book(id,name);
      count++;
      System.out.println("Book added");
    }
    
  }

void issueBook(int id){
  boolean found = false;

  for(int i = 0; i < count; i++){
    if(books[i].id == id){
      found = true;

      if(books[i].isIssued){
        System.out.println("Already Issued");
      }
      else{
        books[i].isIssued = true;
        System.out.println("Book Issued");
      }

      break; 
    }
  }

  if(!found){
    System.out.println("Book not found");
  }
}


void returnBook(int id){
  boolean found = false;

  for(int i = 0 ; i<count ; i++){
    if(books[i].id== id){
      found = true;
      if(books[i].isIssued==false){
        System.out.println("Not issued yet");
      }
      else{
        books[i].isIssued = false;
        System.out.println("Book returned");
      }

       break;
    }
   
  }
  if(!found){
    System.out.println("Book not found");
  }
}



}



