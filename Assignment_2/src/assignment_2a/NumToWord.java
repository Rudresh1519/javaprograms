package assignment_2a;

import java.util.Scanner;

public class NumToWord {

	static String[] string1 = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen","fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "ninteen"};
	 static String[] string2 = {"", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty"};
	
	public static void check(int number1,String string3)
	{
	  if(number1>19)
	  {
		  System.out.print(string2[number1/10] +""+ string1[number1%10]);
	  }
	  else
		  System.out.print(string1[number1]);
	  
	  if(number1>0)
		  System.out.print(" "+string3+" ");
	  
	}
	public static void main(String[] args) {
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("enter the number to be displayed in words");
		int number = scanner1.nextInt();
	
        check((number/10000000),"crore");
        check((number/100000)%100,"lakh");
        check((number/1000)%100,"thousand");
        check((number/100)%10,"hundred");
        check((number%100),"");
        
      
	}

}
