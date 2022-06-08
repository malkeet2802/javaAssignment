
1.
Write a program to print the name, salary and date of joining of 10 employees in a company.
Use array of objects.

class Employee{
	String name;
	int salary;
	String join_date;
	
	public void print(){
		System.out.println(this.name+this.salary+this.join_date);
	}
}
class EmployeeInfo{
	public static void main(String[] args){
	Employee[] emp = new Employee[4];
	
	emp[0]= new Employee();
	emp[0].name="Malkeet";
	emp[0].salary=65000;
	emp[0].join_date="01-01-2023";
	
	emp[1]= new Employee();
	emp[1].name="Malkeet1";
	emp[1].salary=65001;
	emp[1].join_date="02-01-2023";
	
	emp[2]= new Employee();
	emp[2].name="Malkeet1";
	emp[2].salary=65002;
	emp[2].join_date="03-01-2023";
	
	emp[3]= new Employee();
	emp[3].name="alkeet";
	emp[3].salary=55000;
	emp[3].join_date="04-01-2023";
	
	emp[0].print();
	emp[1].print();
	emp[2].print();
	emp[3].print();
	}
}


2.
Write a program to print the roll number and average marks of 8 students in three subjects (each out of 100). The marks are entered by user.

import java.util.*;
class Student{
	int roll_no;
	double marks_subject1;
	double marks_subject2;
	double marks_subject3;
	double average;
	Student(int roll_no,double marks_subject1,double marks_subject2,double marks_subject3){
		this.roll_no=roll_no;
		this.marks_subject1=marks_subject1;
		this.marks_subject1=marks_subject2;
		this.marks_subject3=marks_subject3;
	}
	public void averagemarks(){
		this.average=(this.marks_subject1+this.marks_subject2+this.marks_subject3)/3;
		System.out.println(this.roll_no+"has average of:-"+this.average);
	}
}
class StudentInfo{
	public static void main(String[] args){
		int a =0;
		double b=0;
		double c=0;
		double d=0;
		Student[] stu = new Student[8];
		
		for(int i =0;i<8;i++){
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter Roll NO.");
			a =sc.nextInt();
			System.out.println("Enter Marks");
			b=sc.nextDouble();
			c=sc.nextDouble();
			d=sc.nextDouble();	
			stu[i]=new Student(a,b,c,d);
		}
		
		for(int i =0;i<8;i++){
			stu[i].averagemarks();
		}
		
	}
}

3.
Write a program to calculate the average height of all the students of a class.
 The number of students and their heights in a class are entered by user.

import java.util.*;
class Height{
	double height;
	
	Height(double height){
		this.height=height;
	}
}
class GetAverage{
	public static void main(String[] args){
	double average=0;
	double sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter No. of student in class");
	int a = sc.nextInt();
	Height[] h = new Height[a];
	for (int i=0;i<a;i++){
		double b = sc.nextDouble();
		h[i]= new Height(b);
	}
	
	for (int i=0;i<a;i++){
			sum=(sum+h[i].height);
	}
	average=sum/a;
	System.out.println(average);
	}
}
	



/*
4.
Lets create a bank account. Create a class named 'BankAccount' with the following data members
1 - Name of depositor
2 - Address of depositor
3 - Type of account
4 - Balance in account
5 - Number of transactions
Class 'BankAccount' has a method for each of the following 1 - Generate a unique account number for each depositor
For first depositor, account number will be BA1000, for second depositor it will be BA1001 and so on
2 - Display information and balance of depositor
3 - Deposit more amount in balance of any depositor
4 - Withdraw some amount from balance deposited
5 - Change address of depositor
After creating the class, do the following operations
1 - Enter the information (name, address, type of account, balance) of the depositors. Number of depositors are to be entered by user.
2 - Print the information of any depositor.
3 - Add some amount to the account of any depositor and then display final informaion of that depositor
4 - Remove some amount from the account of any depositor and then display final informaion of that depositor
5 - Change the address of any depositor and then display the final information of that depositor
6 - Randomly repeat these processes for some other bank accounts and after that print the total number of transactions.



5.
Write a program to create a directory that contains the following information.
(a) Name of a person
(b) Address
(c) Telephone Number (if available with STD code)
(d) Mobile Number (if available)
(e) Head of the family
(f) Unique ID No.
The program will support the following menu based activities:
(a) Create a database entry (The Unique ID number must be unique for every entry, the telephone numbers of two or more persons can be same if and only if the head of family is same)
(b) Edit an entry (Must be identified by only the Unique ID number)
(c) Search by keyword (Any keyword may not be complete; even if the keyword matches partially with any field, the corresponding information must be displayed)
*/
