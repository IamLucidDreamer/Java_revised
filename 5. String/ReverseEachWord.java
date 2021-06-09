import java.util.Scanner;

class ReverseEachWord {

    static String reverseEachWord(String str)
    {
        // Write your code here\
    String words[]=str.split("\\s");
    String reverseWord="";
    for(String w:words){
        StringBuilder sb=new StringBuilder(w);
        sb.reverse();
        reverseWord+=sb.toString()+" ";
    }
    return reverseWord.trim();
}

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseEachWord(input);
        System.out.println(ans);
    }
}
