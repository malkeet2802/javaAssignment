/*Write a program to print the names of students by creating a Student class.
 If no name is passed while creating an object of Student class, then the name should be "Unknown", 
 otherwise the name should be equal to the String value passed while creating object of Student class.*/
 
 class Student{
	String name;
	{
		this.name="unknown";
	}
	public void name1(){
		System.out.println(this.name);
	}
	public void name1(String name){
			this.name=name;
			System.out.println(this.name);
	}
 }
 class SS{
	public static void main(String[] args){
	Student s1= new Student();
	s1.name1();
	s1.name1("Malkeet");
	 }
 }