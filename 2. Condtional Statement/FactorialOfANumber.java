import java.util.*;

class FactorialOfANumber
 {
	
	public static void main(String args[]) {
		
		// Write code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0)
        {
            System.out.print("Error");
        }
        else if (num == 0)
        {
            System.out.print("1");
        }
        else
        {
            long fact = 1;
            for(int i = num; i>= 1; i-- )
            {
                fact = fact * i;
            }
            System.out.print(fact);
        }
		
	}
}