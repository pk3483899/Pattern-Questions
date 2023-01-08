//Print the given pattern

//			
//			*
//			* *
//			* * *
//			* * * * *

package Patterns;

import java.util.Scanner;

public class Type3Pattern {
	public static void main(String[] args) {
		System.out.println("Program to print the rectangular pattern");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int row=sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
