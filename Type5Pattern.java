//Print the given pattern
//
//				      *
//				    * *
//				  * * *
//				* * * *   

package Patterns;
import java.util.*;
public class Type5Pattern {
	public static void main(String[] args) {
		System.out.println("Program to print the mirror of the right angled triangle");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}
