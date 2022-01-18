package java_lab;
import java.util.Scanner;

class Employer{
  String name, PhoneNumber, address;
  int age, salary;
  void GetDetails(){
  Scanner  s = new Scanner(System.in);
		System.out.println("\nEnter name: ");
		name = s.next();
		System.out.println("\nEnter age: ");
		age = s.nextInt();
		System.out.println("\nEnter phone number: ");
		PhoneNumber = s.next();
		System.out.println("\nEnter address: ");
		address = s.next();
		System.out.println("\nEnter salary: ");
		salary = s.nextInt();
        }
  void PrintDetails(){
		System.out.print("\nName: "+ name);
		System.out.print("\nAge: "+age);
		System.out.print("\nPhone number: "+PhoneNumber);
		System.out.print("\nAddress: "+address);
		System.out.print("\nSalary: "+salary);
        }
}  
class officer extends Employer{
	String specialization;
	
  void GetDetails() {
      Scanner  s = new Scanner(System.in);
      System.out.print("\nEnter Specialization: ");
      specialization = s.nextLine();
      super.GetDetails();
   }
  void PrintDetails() {
      super.PrintDetails();
      System.out.print("\nSpecialization: " +specialization);
  }
}

class manager extends Employer{
	String department;
	
  void GetDetails() {
      Scanner  s = new Scanner(System.in);
      System.out.print("\nEnter Department: ");
      department = s.nextLine();
      super.GetDetails();
   }
  void PrintDetails() {
      super.PrintDetails();
      System.out.print("\nDepartment: " +department);
   }
}

public class Employee{
  public static void main(String[] args) {
      officer officer1 = new officer();
      manager manager1 = new manager();
      
      System.out.print("Enter Officer details\n");
      officer1.GetDetails();
      System.out.print("\nEnter Manager details\n");
      manager1.GetDetails();
      System.out.print("\nDetails of Officer");
      officer1.PrintDetails();
      System.out.print("\n\nDetails of Manager");
      manager1.PrintDetails();
  }
}
