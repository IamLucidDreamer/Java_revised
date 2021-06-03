import java.util.*;

class FahrenheitToCelsius
 {
	
	public static void main(String args[]) {
		
		// Write code here
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        int w = sc.nextInt();
        int c;
        for (int i=s ;i<=e ;i+=w)
        {
            c = (i - 32)*5/9;
            System.out.println(i+"\t"+c);
        }	
	}
}