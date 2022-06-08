
1.
Create a class named 'PrintNumber' to print various numbers of different datatypes
 by creating different methods with the same name 'printn' having a parameter
 for each datatype.

class PrintNumber{
	public void printn(String s){
		System.out.println("String:-"+s);
	}
	public void printn(int i){
		System.out.println(i);
	}
	public void printn(double d){
		System.out.println(d);
	}
	public void printn(char c){
		System.out.println("Char:-"+c);
	}
	
}

class PrintNumberDemo{
	public static void main(String[] args){
		PrintNumber p=new PrintNumber();
		p.printn(5);
		p.printn("Malkeet");
		p.printn(10.2);
		p.printn('c');
	}
	
}


2.
Create a class to print an integer and a character with two methods having the same name but different sequence of the integer and the character parameters.
For example, if the parameters of the first method are of the form (int n, char c), then that of the second method will be of the form (char c, int n).

}

class HaiKoi{
	public static void main(String[] args){
			public void Heinn(int a, char b){
		System.out.println(a+" "+b);
		
	}
	public void Heinn(char a,int b){
		System.out.println(a+" "+b);
		g.Heinn('a',5);
		g.Heinn(6,'c');
		
		
	}
	
}

3.
Create a class to print the area of a square and a rectangle. The class has two methods with the same 
name but different number of parameters. The method for printing area of rectangle has two parameters 
which are length and breadth respetively while the other method for printing area of square has one parameter which is side of square.

class RectSquareArea{
	public double Area(int a){
		return a*a;
	}
	public double Area(int a, int b){
		return a*b;
	}
}
class Calculation{
	public static void main(String[] args){
		RectSquareArea rsa= new RectSquareArea();
		System.out.println(rsa.Area(5));
		System.out.println(rsa.Area(10,12));		
	}	
}
4.
Create a class 'Student' with three data members which are name, age and address.
 The constructor of the class assigns default values name as "unknown", age as '0' and address as "not available". 
 It has two members with the same name 'setInfo'. First method has two parameters for name and age and assigns the same 
 whereas the second method takes has three parameters which are assigned to name, age and address respectively.
 Print the name, age and address of 10 students.
Hint - Use array of objects

class Student{
	String name;
	int age;
	String address;
	
	
	{
			this.name= "unknown";
			this.age= 0;
			this.address="Not Available";
	}
	public void setInfo(String name,int age){
		
			System.out.println(this.name+this.age);
			this.name=name;
			this.age=age;
			
			System.out.println(this.name+this.age);
	}
	public void setInfo(String name,int age,String address){
			this.name=name;
			this.age=age;
			this.address=address;
			System.out.println(this.name+this.age+this.address);
			
		
	}
}
class StuddentArray{
	public static void main(String[] args){
		Student[] stu= new Student[4];
		
		stu[0] = new Student();
		stu[0].setInfo("Anushka",32,"Nashik");
		
		stu[1] = new Student();
		stu[1].setInfo("Malkeet",26);
		
		stu[2]=new Student();
		stu[2].setInfo("Lokya",28,"JL");
		/*
		stu[0].name="Anushka";
		stu[0].age=32;
		stu[0].address="Nashik";
		
		
		stu[1] = new Student();
		stu[1].name="Lokesh";
		stu[1].age=15;
		stu[1].address="Jalgao";
		
		
		stu[2] = new Student();
		stu[2].name="Sahil";
		stu[2].age=17;
		stu[2].address="Pune";
		
		
		stu[3] = new Student();
		stu[3].name="Malkeet";
		stu[3].age=26;
		stu[3].address="Mumbai";
		
		//System.out.print(stu[0].setInfo());
		//stu[1].setInfo();
		//stu[2].setInfo();
		//stu[3].setInfo();
		*/
		
	}
	
}


5.
Create a class 'Degree' having a method 'getDegree' that prints "I got a degree".
 It has two subclasses namely 'Undergraduate' and 'Postgraduate' each having a method with the same name that
 prints "I am an Undergraduate" and "I am a Postgraduate" respectively. Call the method by creating an object of each of the three classes.
 
class Degree{
	public void getDegree(){
		System.out.println("I got a degree");	
	}	
	 
}
class Undergraduate extends Degree{
	public void getDegree(){
		System.out.println("I am an Undergraduate");	
	}
	public void getDegree1(){
		System.out.println("I got a  free degree");
}
}
class Postgraduate extends Degree{
	public void getDegree(){
		System.out.println("I am a Postgraduate");	
	}
}
class D{
	public static void main(String[] args){
		Degree d = new Degree();
		Degree d1= new Undergraduate();
		Undergraduate u1= (Undergraduate)d1;
		d.getDegree();
		d1.getDegree();
		u1.getDegree();
		u1.getDegree1();
		Undergraduate u = new Undergraduate();
		u.getDegree();
		Postgraduate p = new Postgraduate();
		p.getDegree();
	}
}