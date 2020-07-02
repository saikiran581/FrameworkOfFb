import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		int n,r,s=0;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		n=sc.nextInt();
		int t=n;
		while(n>0)
		{
		
		r=n%10;
		n=n/10;
		s=s*10+r;
		
		}
		if(s==t)
		{
			System.out.println("The given no is polindrome");
		}
		else{ 
			System.out.println("The given no is not polindrome");
		}
	}

}
