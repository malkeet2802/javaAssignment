Q1.Create two classes named Mammals and MarineAnimals. Create another class named BlueWhale
 which inherits both the above classes. Now, create a function in each of these classes which prints
 "I am mammal", "I am a marine animal" and "I belong to both the categories: Mammals as well as Marine Animals" respectively.
 Now, create an object for each of the above class and try calling
1 - function of Mammals by the object of Mammal
2 - function of MarineAnimal by the object of MarineAnimal
3 - function of BlueWhale by the object of BlueWhale
4 - function of each of its parent by the object of BlueWhale

interface Mammal{
	void mammal();
}
interface MarineAnimals {
	void marineAnimals();
}
class BlueWhale implements Mammal,MarineAnimals{
	public void mammal(){
		System.out.println("I am Mammal");
	}
	public void marineAnimals(){
		System.out.println("I am MarineAnimal");
	}
	public void blueWhale(){
		System.out.println("I belong to both the categories: Mammals as well as Marine Animals");
	}
}
class SeaWorld{
	
	public static void main(String[] args){
		BlueWhale b = new BlueWhale();
		b.mammal();
		b.marineAnimals();
		b.blueWhale();
		
	}
}



2.
Make a class named Fruit with a data member to calculate the number of fruits in a basket.
 Create two other class named Apples and Mangoes to calculate the number of apples and mangoes in the basket.
 Print the number of fruits of each type and the total number of fruits in the basket.

class Fruit{
	int no_of_fruits;
	int no_of_mango;
	int no_of_apple;
	
	public void numberofmango(int a ){
		this.no_of_mango=a;
		
	}
	public void numberofapple(int b){
		this.no_of_apple=b;
	}
	public void no_of_fruit(){
		this.no_of_fruits=this.no_of_mango+this.no_of_apple;
		System.out.println()
	}
	
}
class Mango extends fruits{
	int number=0;
	public void numberofmango(int a){
		number++
	}
}
class Apple 

class Fruit {
	static int ac = 0 ;
	static int mc = 0 ;
	
	static void display(){
		System.out.println("total fruit = "+(ac+mc)+" Apple count = "+ac+" mango count = "+mc);
	}
}
class Apple{
	static void aadd(){
		Fruit.ac++ ;
	}
}
class Mango {
	static void madd(){
		Fruit.mc++ ;
	}
}
class Day5{
	public static void main (String [] args){
		for (int i = 1 ; i<5 ;i++){
			Apple.aadd();
			Mango.madd();
		}
		Fruit.display();
	}
}


/*
3.
We want to calculate the total marks of each student of a class in Physics,Chemistry and Mathematics and the average marks of the class. 
The number of students in the class are entered by the user. Create a class named Marks with data members for roll number, name and marks.
 Create three other classes inheriting the Marks class, namely Physics, Chemistry and Mathematics, which are used to define marks in individual subject of each student.
 Roll number of each student will be generated automatically.




4.
We want to store the information of different vehicles. Create a class named Vehicle with two data member named mileage and price. Create its two subclasses
*Car with data members to store ownership cost, warranty (by years), seating capacity and fuel type (diesel or petrol).
*Bike with data members to store the number of cylinders, number of gears, cooling type(air, liquid or oil), wheel type(alloys or spokes) and fuel tank size(in inches)
Make another two subclasses Audi and Ford of Car, each having a data member to store the model type. Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership cost, warranty, seating capacity, fuel type, mileage and price.) Do the same for a Bajaj and a TVS bike.

5.
Create a class named Shape with a function that prints "This is a shape". Create another class named Polygon inheriting the Shape class with the same function that prints "Polygon is a shape". Create two other classes named Rectangle and Triangle having the same function which prints "Rectangle is a polygon" and "Triangle is a polygon" respectively. Again, make another class named Square having the same function which prints "Square is a rectangle".
Now, try calling the function by the object of each of these classes.
*/
6.
All the banks operating in India are controlled by RBI. RBI has set a well defined guideline (e.g. minimum interest rate, minimum balance allowed, maximum withdrawal limit etc) which all banks must follow. For example, suppose RBI has set minimum interest rate applicable to a saving bank account to be 4% annually; however, banks are free to use 4% interest rate or to set any rates above it.
Write a program to implement bank functionality in the above scenario. Note: Create few classes namely Customer, Account, RBI (Base Class) and few derived classes (SBI, ICICI, PNB etc). Assume and implement required member variables and functions in each class.
Hint:
Class Customer
{
//Personal Details ...
// Few functions ...
}
Class Account
{
// Account Detail ...
// Few functions ...
} 
Class RBI
{
Customer c; //hasA relationship
Account a;	//hasA relationship
..
Public double GetInterestRate() {	}
Public double GetWithdrawalLimit() {	}
}
Class SBI: public RBI
{
//Use RBI functionality or define own functionality.
} 
Class ICICI: public RBI
{
//Use RBI functionality or define own functionality.
}
*/

