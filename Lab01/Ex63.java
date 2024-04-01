import java.util.Scanner;
public class Ex63 {

	public static void main(String[] args) {
		Scanner N = new Scanner(System.in);
		System.out.println("enter the value n = ");
		int n = N.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=1;j<=n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
			
		}
		System.exit(0);

	}

}
