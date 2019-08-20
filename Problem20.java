package codex;
public class Problem20 {
int Sum=0,r;
long F=1;
{
for(int n=1;n<=100;n++)
{
	F=F*n;
}
while(F>0)
{
	long r;
	int Sum=0;
	r=F%10;
	Sum= Sum+(int) r;
	F=F/10;
}
System.out.println("The sum of the numbers is"+ Sum);
}
}
