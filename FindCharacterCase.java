import java.util.*;
class FindCharacterCase
 {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int ascii = (int)ch;
        if (ascii >= 65 && ascii <=90)
        {
            System.out.print("1");
        }
        else if (ascii >= 97 && ascii <=122)
        {
            System.out.print("0");
        }
        else
        {
            System.out.print("-1");
        }
	}
}