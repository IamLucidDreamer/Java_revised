import java.util.*;

class SwapTwoNumbers
 {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.printf("%d\n%d",a,b);
	}
}