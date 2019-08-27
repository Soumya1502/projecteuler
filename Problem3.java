package codex;

public class Problem3 {
	private static final long NUMBER = 600851475143L;

    public static void main(String[] args) {
        
        long result = 0;
        for(int i = 2; i < NUMBER; i++) {
            if(NUMBER % i == 0 && isPrime(NUMBER / i)) {
                result = NUMBER / i;
                break;
            }
        }
        System.out.println("Result: " + result);
    }

    public static boolean isPrime(long l) {
    	boolean status= true;
        for(long num = 3 ; num <=Math.sqrt(l) ; num+=2) {
            if(l % num == 0) 
                status=false;
            }
        
        return status;
    }
            
    }


