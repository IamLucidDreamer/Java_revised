import java.util.Scanner;

public class SetBits {
	
	// Write your countSetBits function here
	public int countSetBits(int a)
    {
     int bit;
     int count = 0;
        while (a !=0 )
        {
            bit = a % 2;
            a = a / 2;
            if (bit == 1)
            {
                count++;
            }
        }
        return count;
    }
    
	public static void main(String args[]) {
		
		SetBits obj = new SetBits();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(obj.countSetBits(n));
	}	
}