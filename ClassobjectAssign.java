
Create a class named 'Student' with String variable 'name' 
and integer variable 'roll_no'. Assign the value of roll_no as '2' 
and that of name as "John" by creating an object of the class Student.

class Student{
	String name;
	int roll_no;
	
	Student(String name,int roll_no){
		this.name=name;
		this.roll_no=roll_no;
	}
}
class StudentDetails{
	public static void main(String[] args){ 
	Student s=new Student("John",2);
	System.out.println(s.name+" "+s.roll_no);
	}
}




2.
Assign and print the roll number, phone number and address of two students
 having names "Sam" and "John"
 respectively by creating two objects of class 'Student'.

class Student{
	String name;
	String address;
	String phone_no;
	int roll_no;
	
	Student(String name,int roll_no,String address,String phone_no){
		this.name=name;
		this.roll_no=roll_no;
		this.address=address;
		this.phone_no=phone_no;
	}
}
class StudentDetails{
	public static void main(String[] args){ 
	Student s=new Student("John",2,"Mumbai","9769176830");
	Student s1=new Student("Sam",3,"Nashik","9769185855");
	System.out.println(s.name+" "+s.roll_no+" "+s.address+" "+s.phone_no);
	System.out.println(s1.name+" "+s1.roll_no+" "+s1.address+" "+s1.phone_no);
	}
}


3.
Write a program to print the area and perimeter of a triangle
 having sides of 3, 4 and 5 units by creating a class named 'Triangle' 
 without any parameter in its constructor.
 class Triangledetails{
	 int side1 =3;
	 int side2=4;
	 int side3=5;
	 double area=0;
	 double p=0;
	 double perimeter;
	 public void perimeter(){
		perimeter=(side1+side2+side3);
		System.out.println("perimeter of triangle is"+perimeter);
	  
	 }
	 public void area(){
		perimeter=(side1+side2+side3);
		p=perimeter/2;
		area=Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
		System.out.println("area of triangle is"+area);
		} 
 }
 class Triangle{
	 public static void main(String[] args){
		 Triangledetails t = new Triangledetails();
		 t.area();
		 t.perimeter();
		 
	 }
	 
 }

4.
Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units
 by creating a class named 'Triangle' with constructor having
 the three sides as its parameters.

class Triangledetails{
	 int side1;
	 int side2;
	 int side3;
	 double area=0;
	 double p=0;
	 double perimeter=0;
	 Triangledetails(int side1,int side2,int side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	 }
	public void perimeter(){
		 perimeter=(this.side1+this.side2+this.side3);
		System.out.println(perimeter);
	 }
	 public void area(){
		perimeter=(this.side1+this.side2+this.side3);
		p=perimeter/2;
		area=Math.sqrt(p*(p-this.side1)*(p-this.side2)*(p-this.side3));
		System.out.println("area of triangle is"+area);
	 }
}
class Triangle{
	 public static void main(String[] args){
		 Triangledetails t = new Triangledetails(3,4,5);
		 t.perimeter();
		 t.area();
		 
	 }
}
	 
 


5.
Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively
 by creating a class named 'Rectangle' with a method named 'Area'
 which returns the area and length and breadth passed as parameters to its constructor.

class Rectangledetails{
	int length;
	int breadth;
	double area;
	Rectangledetails(int l,int b){
		length=l;
		breadth=b;
	}
	public double area(){
		area=length*breadth;
		
		return area;
	}
}
class Rectangle{
	 public static void main(String[] args){
		 Rectangledetails r = new Rectangledetails(4,5);
		 //t.perimeter();
		 System.out.println(r.area());
		 
		 Rectangledetails r1 = new Rectangledetails(5,8);
		 System.out.println(r1.area());		 
	 }
}
*/


6.
Write a program to print the area of a rectangle by creating a class named 'Area'
 having two methods.
 First method named as 'setDim' takes length and breadth of rectangle as parameters
 and the second method named as 'getArea' returns the area of the rectangle.
 Length and breadth of rectangle are entered through keyboard.

import java.util.Scanner;
class Area{
	int length;
	int breadth;
	double area;
	
	public void setDim(int m,int n){
		length=m;
		breadth=n;
	}
	public double getArea(){
		area=length*breadth;
		return area;
	}
		
}
class Area1{
	public static void main(String[] args){
	int j;
	int k;
     Scanner s=new Scanner(System.in);
	 
     System.out.println("Enter length"); 
     j=s.nextInt();
	 
     System.out.println("Enter breadth");
     k=s.nextInt();
	Area a = new Area();
	a.setDim(j,k);
	System.out.println(a.getArea());
	}
	
}


Write a program to print the area of a rectangle by creating a class named 
'Area' taking the values of its length and breadth as parameters of its constructor 
and having a method named 'returnArea' which returns the area of the rectangle.
 Length and breadth of rectangle are entered through keyboard.


import java.util.Scanner;
class Area{
	int length;
	int breadth;
	double area;
	
	Area(int m,int n){
		length=m;
		breadth=n;
	}
	public double getArea(){
		area=length*breadth;
		return area;
	}
		
}
class Area1{
	public static void main(String[] args){
	int j;
	int k;
     Scanner s=new Scanner(System.in);
	 
     System.out.println("Enter length"); 
     j=s.nextInt();
	 
     System.out.println("Enter breadth");
     k=s.nextInt();
	Area a = new Area(j,k);
	System.out.println(a.getArea());
	}
	
}




8.
Print the average of three numbers entered by user by creating a class named 'Average'
 having a method to calculate and print the average.

import java.util.Scanner;
class Details{
	int i;
	int j;
	int k;
	double average;
	
	public double average(int i,int j, int k){
		average=(i+j+k)/3;
		return average;
	}
}

class Average{
	public static void main(String[] args){
		int i,j,k;
		Scanner s = new Scanner(System.in);
		System.out.println("enter first number");
		i=s.nextInt();
		System.out.println("enter 2nd number");
		j=s.nextInt();
		System.out.println("enter 3rd number");
		k=s.nextInt();
		
		
		Details d= new Details();
		System.out.println(d.average(i,j,k));
	}
	
}


9.
Print the sum, difference and product of two complex numbers by creating a class named 'Complex'
 with separate methods for each operation whose real and imaginary parts are entered by user.

import java.util.Scanner;
class Complex{
	public static void main(String[] args){
		real m=3;
		complexm=4j;
		complex n=5-6j;
		sum1=0;
		diff=0;
		prod=0;
	public void sum(){
		sum1=m+n;
	}
	public void diff(){
		diff=m-n;
	}
	public void prod(){
		prod=m*n;
	}
	System.out.println(sum());
	System.out.println(diff());
	System.out.println(prod());
	}
	
}

10.
Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat
*/



/*
11.
Add two distances in inch-feet by creating a class named 'AddDistance'.
*/