package codex;
import java.util.*;
import java.io.*;
public class problem6 {
public static void main(String[]args)
{
	System.out.println("Enter the number upto which you want to calculate the result");
	Scanner s=Scanner(System.in);
	int n=s.nextInt();
	int p=SumofSquare(n);
	int q=SquareofSum(n);
	int r=p-q;
	System.out.println("the difference of sum of square and sqare of sum is"+r);
}

private static int SquareofSum(int n) {
	// TODO Auto-generated method stub
	int b=0;
	for (int i=1;i<=n;i++)
	{
		b=b+i;
	}
	b=b*b;
	System.out.println("The square of the sum is"+b);
	return b;
}

private static int SumofSquare(int n) {
	int a=0;
	for (int i=1;i<=n;i++)
	{
		a=a+(i*i);
	}
		System.out.println("The sum of the squares is "+a);
		return a;
	
	
	// TODO Auto-generated method stub
}

private static Scanner Scanner(InputStream in) {
	// TODO Auto-generated method stub
	return null;
}
}
