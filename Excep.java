/*
1)Create abstract base class "Game" with 'play()' as abstract method.
From that derive following classes.
Football,Cricket,Tennis
Create a class called as "GamesDemo" (public class)
inside a main method create an array of "Game" (3 elements)
Store objects of Football,Cricket and Tennis respectively.
Now traverse the array and call that Cricket's play() method.

abstract class Game{
	abstract public void play();
} 
class Football extends Game{
	public void play(){
		System.out.println("Football");
	}
}
class Cricket extends Game{
	public void play(){
		System.out.println("Cricket");
	}
}
class Tennis extends Game{
	public void play(){
		System.out.println("Tennis");
	}
}
class GamesDemo{
	public static void main(String[] args){
		Game[] g = new Game[3];
		g[0]=new Football();
		g[1]=new Cricket();
		g[2]=new Tennis();
		
		for (int i = 0; i< 3;i++){
			if (g[i] instanceof Cricket){
				g[i].play();
				break;
			}
		}
	}
	
}

2) define your exception class by name "MyArithException"
(MyArithException.java)
define class "Calculator"   (Calculator.java)
In this class define a function,which will accept an int and return double of it.
e.g int caldouble(int)
This function will check an int which is passed to it
It will throw exception if 0 is passed or negative passed
in case of 0 caller of this method should get error message
"Zero not allowed" 
in case of negative caller of this method should get error message
"negative not allowed"
In case of positive value it should simply return the double value.

Now define class "MyCalcApp" (MyCalcApp.java)
In this class you accept a number from user and pass that no. to
caldouble() method which is mentioned above.



class Calculator{
	public int caldouble(int a){
		return a;		
	}
}
class MyArithException{
		public static void main(String[] args){
			Calculator c = new Calculator();
			int a =0;
			c.caldouble(a);
		}
}

import java.util.Scanner;

class MyArithException extends Exception
{
	public MyArithException(String message)
	{
		super(message);
	}
}

 class Calculator
{
	public double casting(int num)throws MyArithException
	{
		if(num==0)
		{
			throw new MyArithException(" Zero not allowed ");
		}
            if(num<0)
          {
            	throw new MyArithException(" Negative not allowed ");
  		
           }

		return num;
	}
}

class MyCalcApp {
	static void disp()throws MyArithException
	{
		Calculator c=new Calculator();
		double result=0;
		System.out.println("Enter a number ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		result=c.casting(num);
		System.out.println(result);
	}

	public static void main(String[] args) {
		
		try
		{
			disp();
		}
		catch(MyArithException m)
		{
			System.out.println(m);
		}
		System.out.println("Done");
	}
	
	}
	*/
	
class NumberpointerExcep{
	public static void main(String[] args){
		try{
			Integer i = new Integer("abc");
		}catch(NumberFormatException e){
			System.out.println("NFE");
		}catch(RuntimeException e){
			System.out.println("RE");
		}finally{
			
		}
	}
}