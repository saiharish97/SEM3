import java.util.Scanner;

public class String_Test {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Number : ");
		String inp=br.readLine();
		StringBuilder str=new StringBuilder(inp);
		int c=0;
		for(int i=str.length()-1; i>=0; i--)
		{
			c++;
			if(c%3==0 && i!=0)
				str.insert(i, ',');
		}
		System.out.println("String is : " + str);
	}
}
