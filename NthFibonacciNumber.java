import java.util.*;

class NthFibonacciNumber
 {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        n = n - 2;
        while(n != 0)
        {
            c = a + b;
            a = b;
            b = c;
            n--;
        }
        System.out.print(c);
	}
}