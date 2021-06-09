import java.util.Scanner;
class PrintAllDivisorsOfANumber {
	
	// Write your printDivisor function here
    public void printDivisor(int a)
    {
        for(int i = 1; i <= a ; i++)
        {
            if (a%i == 0)
            {
                System.out.print(i+" ");
            }
        }
    }
	
	public static void main(String args[]) {
		PrintAllDivisorsOfANumber obj = new PrintAllDivisorsOfANumber();
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		obj.printDivisor(n);
	}
}