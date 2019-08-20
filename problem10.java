package codex;
public class problem10 {
public boolean Checkprime(long number)
{
boolean status = true;
for(int i=3; i<=Math.sqrt(number);i+=2)
{
		if(number % i == 0)
		{
			status = false;
			break;
		}
}
return status;
}
public void sum()
{
	long sum =2;
	long i=3;
	while (i < 2000000)
	{
		if(Checkprime(i))
		{
			sum=sum+i;
		}
		i=i+2;
	}
	System.out.println(sum);
}
public static void main(String args[])
{
	problem10 ob = new problem10();
	ob.sum();
}
}