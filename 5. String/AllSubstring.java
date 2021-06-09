import java.util.Scanner;
class AllSubstring {

    static void printSubstrings(String input) {
        // Write your code here
        int l = input.length();
        String str;
        for(int i = 0; i < l ; i++)
        {
            for(int j = i + 1; j <= l ; j++)
            {
                str = input.substring(i , j);
                System.out.println(str);
            }
        }
    }

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        printSubstrings(input);
	}
}
