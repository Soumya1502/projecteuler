package codex;

public class problem12 {
	public int ToGenerateTrnNumb(int a)
    {
        return(a*a+a)/2;
    }
	public int TogetNoOfDiv(int numb)
    {
        int counter = 0;
        int a=(int)Math.sqrt(numb);
        for(int m = 1;m<a;m++)
        {
            if(numb % m == 0)
            counter=counter+2;      
        } 
        return counter;
    }
    
    public static void main(String args [])
    {
        problem12 ob = new problem12();
        int result = 0;
        for(int p =1;;p++)
        {
            if(ob.TogetNoOfDiv(ob.ToGenerateTrnNumb(p)) > 500)
            {
                result = ob.ToGenerateTrnNumb(p);
                break;
            }
        }
        System.out.println(result);
    }
}
