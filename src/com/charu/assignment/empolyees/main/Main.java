package com.charu.assignment.empolyees.main;
import com.charu.assignment.empolyees.Developer;
import com.charu.assignment.utilities.EmployeeUtilities;
import com.charu.assignment.empolyees.Manager;
public class Main {

	public static void main(String [] args) {
		
		Manager m=new Manager("charu",20,100000,"cse");
		Developer d=new Developer("mathi",17,200000,"java");
		EmployeeUtilities e1=new EmployeeUtilities();
		
		System.out.println("Manager details");
		e1.print(m);
		System.out.println("Department="+m.getDept());
		
		System.out.println("Developer details");
		e1.print(d);
		System.out.println("programming language="+d.getProgramminglang());
		
		System.out.println("Increased Salary");
		e1.increasesalary(m,10);
		e1.increasesalary(d,15);
		
		
	}
}