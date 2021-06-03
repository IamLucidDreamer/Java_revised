import java.util.*;

class CalculateSimpleInterest
 {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        float r = sc.nextFloat();
        int t = sc.nextInt();
        float i = (p*r*t)/100;
        int j = (int)i;
        System.out.print(j);
	}
}