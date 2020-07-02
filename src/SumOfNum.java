import java.util.Scanner;

public class SumOfNum {

	public static void main(String[] args) {
int n,temp = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number :");
n=sc.nextInt();
for (int i=0;i<n;i++)
{
	temp=temp+i;
}
System.out.println("The sum upto "+ n+" is "+temp );
	}

}
