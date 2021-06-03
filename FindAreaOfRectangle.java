import java.util.Scanner;

class FindAreaOfRectangle {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		// Taking length and breadth as input
		int l = sc.nextInt();
		int b = sc.nextInt();		
		// Area as output
		System.out.println(l * b);
		
	}
}