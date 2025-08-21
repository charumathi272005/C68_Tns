package com.charu.assignment.empolyees;

public class Employee {


		// TODO Auto-generated method stub
		private String name="charu";
		private int empid=27;
		private double salary=500000;
		public Employee(String name, int empid, double salary) {
		}


		void show() {
			System.out.println("employee name:"+name);
			System.out.println("employee id:"+empid);
			System.out.println("employee salary:"+salary);
		}
	
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

        public int getEmployeeid() {
			return empid;
        }
        public void setEmployeeid(int employeeid) {
			this.empid = employeeid;
		}

        public double getSalary() 
		{
			return salary;
		}

        public void setSalary(double salary) {
			this.salary = salary;
		}




}
