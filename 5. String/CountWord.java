import java.util.Scanner;
class CountWord {

    static int  countWords(String input) {
        // Write your code here
        input = " " + input;
        int l = input.length();
        char ch;
        int c = 0;
        for (int i = 0 ; i < l ; i++)
        {
            ch =input.charAt(i);
            if(ch == ' ')
            {
                c++;
            }
        }
        return c;
    }

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int output = countWords(input);
        System.out.println(output);

	}
}
