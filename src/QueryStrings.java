import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class QueryStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a URL to exam its Query Strings:");
		String userURL = keyboard.nextLine();
		
		StringTokenizer st = new StringTokenizer(userURL, "?");
		if(st.countTokens() == 1)
		{
			System.out.println("Query String not found!");
		}else{
			System.out.println("Query String found!");
			st.nextToken();
			StringTokenizer st1 = new StringTokenizer(st.nextToken(), "&");
			
			ArrayList<String> keyValueSets = new ArrayList<>();
			while(st1.hasMoreTokens())
			{
				StringTokenizer st2 = new StringTokenizer(st1.nextToken(), "=");
				
				System.out.printf("Key: %s \t Value: %s \n",  st2.nextToken(), st2.nextToken());
			}

		}
		
}
		
		
	}
