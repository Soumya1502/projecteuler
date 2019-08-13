package codex;

public class Problem20 {
int F=1,Sum=0,r;
{
for(int n=1;n<=1000;n++)
{
	int F=1;
	F=F*n;
}
while(F>0)
{
	int r;
	int Sum=0;
	r=F%10;
	Sum=Sum+r;
	F=F/10;
}
System.out.println("The sum of the numbers is"+Sum);
}
}
