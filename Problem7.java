package codex;

public class Problem7 {
public boolean tocheck (int number)
{
	boolean status =true;
	for (int i=3;i<=Math.sqrt(number);i=i+2)
	{
		if (number % i==0)
		{
			status = false;
			break;
		}
	}
	return status;
}
public static void main(String args[])
{
	Problem7 ob =new Problem7();
	int count = 1 ;
	int primenumber=0;
	for(int i=3;count<10001;i=i+2)
	{
		if(ob.tocheck(i))
		{
			count++;
			primenumber=i;
		}
	}
	System.out.println(primenumber);
}

}
