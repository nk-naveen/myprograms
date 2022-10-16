import java.util.Scanner;

public class Test {

	public static boolean isGoodNumber(int N) {
		if (N % 7 == 0) 
		{
			int x = N;
			while (x != 0) 
			{
				int dig = x % 10;
				if (dig % 7 != 0) 
				{
					x = x / 10;
				} 
				else 
				{
					return false;
				}
			}
			return true;
		} 
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("Enter ");
		int N = m.nextInt();
		boolean result = isGoodNumber(N);
		if(result == true) {
			System.out.println("good number");
		} else {
			System.out.println("not");
		}
	}
}