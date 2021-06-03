import java.util.*;

public class SumOfEvenNumbersTillN
 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0 ;
        for( int i = 0; i <= n ; i+= 2)
        {
                sum = sum + i ;
        }
        System.out.print(sum);
	}
}