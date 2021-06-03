import java.util.*;

class SumOfEvenOdd
 {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long extract;
        long odd = 0;
        long even = 0;
        while(n!=0)
        {
            extract = n % 10;
            if (n % 2 == 0)
            {
                even = even + extract;
            }
            else
            {
                odd = odd + extract;
            }
            n = n / 10;
        }
        System.out.print(even + " " + odd);
	}
}