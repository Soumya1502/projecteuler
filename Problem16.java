package codex;
import java.math.BigInteger;
public class Problem16 {
	
	public static void main(String[] args)
	{
		

		BigInteger big = BigInteger.valueOf(2);
		big = big.pow(1000);
		System.out.println(Digits(big.toString()));
		
	}
		private static int Digits(String dig)
		{
			int sum = 0;
			
			for (int m = 0; m < dig.length(); m++)
			{
				Character c = new Character(dig.charAt(m));
				String r = c.toString();
				int y = Integer.parseInt(r);
				sum=sum+y;
			}
			
			return sum;
		}

		
	}

