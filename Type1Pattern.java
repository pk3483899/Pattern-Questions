//Print the given pattern
//* * * * *
//* * * * *
//* * * * *
//* * * * *

package Patterns;
import java.util.*;
public class Type1Pattern {
	public static void main(String[] args) {
		System.out.println("Program to print Square patterns in java");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of columns: ");
		int col=sc.nextInt();
		System.out.print("Enter the number of Rows: ");
		int row=sc.nextInt();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
