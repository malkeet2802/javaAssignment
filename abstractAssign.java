
1.Create an abstract class 'Parent' with a method 'message'. 
It has two subclasses each having a method with the same name 'message' 
that prints "This is first subclass" and "This is second subclass" respectively. 
Call the methods 'message' by creating an object for each subclass.


abstract class Parent{
	abstract public void message(); 
}
class Child1 extends Parent{
	public void message(){
		System.out.println("This is first Subclass");
	}
}
class Child2 extends Parent{
	public void message(){
		System.out.println("This is second subclass");
	}
}
class Subclass{
	public static void main(String[] args){
	Parent p1 = new Child1();
	p1.message();
	Parent p2 = new Child2();
	p2.message();
	}
}

2.
Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200
 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', 
 each having a method named 'getBalance'. Call this method by creating an object of each of the three classes.

abstract class Bank{
	abstract public void getBalance();
}
class BankA extends Bank{
	double balance;
	BankA(double balance){
		this.balance=balance;
	}
	public void getBalance(){
		System.out.println("Balance of BankA is"+this.balance);
	}
}
class BankB extends Bank{
	double balance;
	BankB(double balance){
		this.balance=balance;
	}
	public void getBalance(){
		System.out.println("Balance of BankB is"+this.balance);
	}
}
class BankC extends Bank{
	double balance;
	BankC(double balance){
		this.balance=balance;
	}
	public void getBalance(){
		System.out.println("Balance of BankA is"+this.balance);
	}
}
class BankBalance{
	public static void main(String[] args){
		Bank ba= new BankA(100);
		ba.getBalance();
		Bank bb= new BankA(150);
		bb.getBalance();
		Bank bc= new BankA(200);
		bc.getBalance();
		
	}
}


3.
We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A
 and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'.
 It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students.
 The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. 
 Create an object for eac of the two classes and print the percentage of marks for both the students.



4.An abstract class has a construtor which prints "This is constructor of abstract class",
 an abstract method named 'a_method' and a non-abstract method which prints "This is a normal method of abstract class".
 A class 'SubClass' inherits the abstract class and has a method named 'a_method' which prints "This is abstract method".
 Now create an object of 'SubClass' and call the abstract method and the non-abstract method. (Analyse the result)
abstract 

abstract class MM{
	MM(){
		System.out.println("This is constructor of abstract class");
	}
	abstract public void a_method();
	public void b_method(){
		System.out.println("This is a normal method of abstract class");
	}
}
class Subclass extends MM{
	Subclass(){
		super();
	}
	public void a_method(){
		System.out.println("This is abstract method");
	}
}
class SS{
	public static void main(String[] args){
		MM m = new Subclass();
		m.a_method();
		m.b_method();
	}
}
	


5.
Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'. 
Now create a class 'Cats' with a method 'cats' which prints "Cats meow" and 
a class 'Dogs' with a method 'dogs' which prints "Dogs bark", both inheriting the class 'Animals'.
 Now create an object for each of the subclasses and call their respective methods.

6.
We have to calculate the area of a rectangle, a square and a circle.
 Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters,
 'SquareArea' and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are its length and breadth, 
 that of 'SquareArea' is its side and that of 'CircleArea' is its radius. 
 Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' 
 for printing the area of rectangle, square and circle respectively. Create an object of class 'Area' and call all the three methods.

abstract class Shape{
	abstract public void RectangleArea(int a,int b);
	abstract public void SquareArea(int a);
	abstract public void CircleArea(int a);
}
class Area extends Shape{
	int length;
	int breadth;
	int side;
	int radius;
	
	public void RectangleArea(int length, int breadth){
		System.out.println((length*breadth));
	}
	public void SquareArea(int side){
		System.out.println((side*side));
	}
	public void CircleArea(int radius){
		System.out.println((3.14*radius*radius));
	}
}
class Area{
	
	
	public static void main(String[] args){
		
		
		Shape s = new Area();
		s.RectangleArea(10,20);
		s.SquareArea(10);
		s.CircleArea(10);
	}
}
*/
/*

7.
Repeat the above question for 4 rectangles, 4 squares and 5 circles.
Hint- Use array of objects.
Shape(int length,int breadth,int side,int radius){
		this.length=length;
		this.breadth=breadth;
		this.side=side;
		this.radius=radius;
		
		
	}
*/

abstract class Shape1{
	abstract public int rectangleArea();
	abstract public int squareArea();
	abstract public double circleArea();
}

abstract class Rectangle extends Shape1 {
	private int length;
	private int breadth;
	
	public Rectangle(int length, int breadth){
		this.length = length;
		this.breadth =  length;
	}
	
	public int rectangleArea(){
		System.out.println((length*breadth));
		return (length*breadth);
	}
}

abstract class Square extends Shape1 {
	private int side;
	
	public Square(int side){
		this.side = side;
	}
	
	public int squareArea(){
		System.out.println((side*side));
		return (side*side);
	}
}

abstract class Circle extends Shape1 {
	private double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public double circleArea(){
		System.out.println((3.14*radius*radius));
		return (3.14*radius*radius);
	}
}

class Area1{
	
	public static void main(String[] args){
		Shape[] s = new Shape[13];
		
		s[0]= new Rectangle(10,20);
		s[1]= new Rectangle(13,12);
		s[2]= new Rectangle(13,52);
		s[3]= new Rectangle(60,40);
		
		s[4]=new Square(10);
		s[5]=new Square(11);
		s[6]=new Square(12);
		s[7]=new Square(13);
		
		s[8]=new Circle(10);
		s[9]=new Square(20);
		s[10]=new Square(30);
		s[11]=new Square(40);
		s[12]=new Square(50);
		
	}
}
