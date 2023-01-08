//print the given pattern
//			* * * * 
//			* * *
//			* * 
//			*



package Patterns;
import java.util.*;
public class Type4Pattern {
public static void main(String[] args) {
	System.out.println("Program to print the right angled triangle whose base is at the top");
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of rows: ");
	int row=sc.nextInt();
	
	for(int i=row;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
