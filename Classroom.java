class Classroom {

  StudentBasic[] students = new StudentBasic[5];
  int count = 0;

  void showAllStudents(){
    if(count == 0){
      System.out.println("No students available");
    }
    else{
      for(int i = 0 ;i<count;i++){
        String status;
        if(students[i].isPresent==true){
          status = "Present";
        }
        else{
          status = "Absent";
        }

        System.out.println("ID: "+students[i].id
          +", Name: "+students[i].name+", Status: "+status
        );
      }
    }
  }
  

  void addStudent(int id, String name){
    if(count == students.length){
      System.out.println("Classroom full");
    }
    else{
      students[count] = new StudentBasic(id, name);
      count++;
      System.out.println("Student added");
    }
  }

  void markPresent(int id){
    boolean found = false;
    for(int i=0;i<count ; i++ ){
      if(students[i].id == id){
        found = true;
        if(students[i].isPresent == true){
          System.out.println("Already present");
        }
        else{
          students[i].isPresent= true;
          System.out.println("Marked present");
        }
        break;
      }
    }
    if(!found){
      System.out.println("Student not found");
    }
  }

  void markAbsent(int id){
    boolean found = false;

    for(int i = 0 ;i<count;i++){
      if(students[i].id==id){
        found = true;
        if(students[i].isPresent == false){
          System.out.println("Already absent");
        }
        else{
          students[i].isPresent = false;
          System.out.println("Marked absent");
        }
        break;

      }
    }

    if(!found){
      System.out.println("Student not found");
    }

  }

}
