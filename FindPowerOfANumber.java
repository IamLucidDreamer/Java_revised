import java.util.*;

class FindPowerOfANumber
 {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int nw = 1 ; 
        while(b != 0)
        {
            nw = nw * a;
            b--;
        }
        System.out.print(nw);
	}
}