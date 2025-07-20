  public class Student{
        String name;
        int rollNumber;
        char grade;
        
        void displayDetails(){
            System.out.println("Name: "+name);
            System.out.println("Roll Number:"+rollNumber);
            System.out.println("Grade:"+grade);
        }
    }       // TODO: Create a class called Student with name, rollNumber, and grade

    // TODO: Create a method to display student details
public class Main {
      public static void main(String[] args) {
          Student si = new Student();
          si.name="Alex";
          si.rollNumber=12;
          si.grade='A';
          si.displayDetails();
        // TODO: Create a Student object and call the method to display details
    }
}
