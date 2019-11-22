package assignment_2a;

import java.util.Scanner;

public class CountOfWords {

	public static void main(String[] args) {
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("enter the statement to count the number of repeated words");
		
		String string1 = scanner1.nextLine();
		String[] string2 = string1.split(" ");
		
		int wordCount = 1;
		
		for(int i=0;i<string2.length-1;i++)
		{
			for(int j=i+1;j<string2.length;j++)
			{
				if(string2[i].equals(string2[j]))
				{
					wordCount++;
				}
			}
			System.out.println(string2[i]+"----"+wordCount);
			wordCount=1;
		}

	}

}
