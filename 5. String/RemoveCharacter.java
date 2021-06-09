import java.util.Scanner;

class RemoveCharacter {

    static StringBuilder removeAllOccurrencesOfChar(String input, char c) {
        // Write your code here
        int l = input.length();
        char ch;
        StringBuilder str = new StringBuilder();
        str = str.append("");
        for(int i = 0 ;i < l; i++)
        {
            ch = input.charAt(i);
            if (c != ch)
            {
                str = str.append(ch);
            }
        }
        return str;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char c = sc.next().charAt(0);
        StringBuilder ans = removeAllOccurrencesOfChar(input, c);
        System.out.println(ans);
    }
}
