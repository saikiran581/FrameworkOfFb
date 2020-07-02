
public class CountOfVowels {

	public static void main(String[] args) {
		int v=0,cn=0;
		String str="internalization";
		str=str.toLowerCase();
		int l=str.length();
		for(int i=0;i<l;i++)
		{
			char c=str.charAt(i);

		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			v++;
			
		}
		else{
			cn++;
		}
		}

	
	System.out.println("Vowels count :"+v);
	System.out.println("Consonents count is :"+cn);
}}
