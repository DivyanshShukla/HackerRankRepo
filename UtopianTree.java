package hackerRank;
import java.util.Scanner;
public class UtopianTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int testcases = s.nextInt();
		int num =0;
		int height =1;
		int n=0;
		while(testcases-- >0)
		{
			height =1;
			num = s.nextInt();
			n = 1;
			while(n <= num)
			{
				if(n%2==0)
					height += 1;
				else
					height *= 2;
				n++;
			}
			System.out.println(height);
		}
	}

}
