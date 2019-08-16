package codex;
import java.math.BigInteger;
public class Problem16 {
	
	public static void main(String[] args)
	{
		

		BigInteger n = BigInteger.valueOf(2);
		n = n.pow(1000);
		System.out.println(calcDigits(n.toString()));
		
	}
		private static int calcDigits(String s)
		{
			int sum = 0;
			
			for (int i = 0; i < s.length(); i++)
			{
				Character c = new Character(s.charAt(i));
				String z = c.toString();
				int j = Integer.parseInt(z);
				sum=sum+j;
			}
			
			return sum;
		}

		
	}

