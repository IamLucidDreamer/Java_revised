import java.util.Scanner;

class ReverseStringWordWise {

    static String reverseStringWordWise(String input)
    {
        // Write your code here
        input = input + " ";
        int l = input.length();
        char ch;
        int a = 0;
        int b;
        String str;
        String str1 = "";
        for (int i = 0; i<l; i++)
        {
            ch = input.charAt(i);
            if(ch == ' ')
            {
                b = i;
                str = input.substring(a , b);
                str1 = str + " " + str1;
                a = b + 1;
            }
    }
    return str1;
 }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }
}
