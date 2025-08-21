package com.charu.assignment.utilities;
import com.charu.assignment.empolyees.Employee;

public class EmployeeUtilities {

		
		public void print(Employee e) {
	System.out.println("Employee name is "+e.getName());
			
			System.out.println("Employee Age is "+e.getEmployeeid());		

			System.out.println("Employee salary is "+e.getSalary());	
		}
		public void increasesalary(Employee e,double percentage) {

			double newsalary=e.getSalary()+(e.getSalary()*percentage/100);
			e.setSalary(newsalary);
			System.out.println("updated salary="+e.getSalary());
			
			
		}
	}
	


