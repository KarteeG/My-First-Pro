package com.oops;

public class Encaspulation {
		
		private void Employeename() {
			System.out.println("Karthick");

		}
		private void Employeeid() {
			System.out.println(25);
		}
			private void Employeecode() {
				System.out.println(121);
			}
			
			private void Employeesalary() {
				System.out.println(25000);
			}
	public static void main(String[] args) {
		Encaspulation a=new Encaspulation();
		a.Employeename();
		a.Employeeid();
		a.Employeecode();
		a.Employeesalary();
	}
			
			

}
