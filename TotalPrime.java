import java.util.Scanner;
class CountPrime {
	
	// Write your totalPrime function here
    public int totalPrime(int a, int b)
    {
        int count = 0;
        int c = 0;
        for (int i = a; i <= b; i++)
        {
            c = 0;
            for (int j = 1; j <= i/2; j++)
            {    
                if (i%j == 0)
                {
                    c++;
                }
            }
            if (c == 1)
            {
                count++;
            }
        }
        return count;
    }
}

class TotalPrime {
	public static void main(String args[]) {
		
		CountPrime obj = new CountPrime();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(obj.totalPrime(s, e));
	}
}
		
			