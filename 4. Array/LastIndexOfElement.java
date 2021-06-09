import java.util.*;

class LastIndexOfElement
 {
	
	public static void main(String args[]) {
		
		// Write code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int c = 0;
        int index = 0;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == x)
            {
                c++;
                index = i;
            }
        }
        if (c != 0 )
        {
            System.out.print(index);
        }
        else
        {
            c = -1;
            System.out.print(c);
        }
	}
}