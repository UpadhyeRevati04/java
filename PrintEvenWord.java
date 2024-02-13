import  java.util.*;
import java.lang.*;

public class PrintEvenWord
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		String data;
		System.out.println("Enter data: ");
		data = sc.nextLine();
		int n = data.length();
		String[] str = data.split(" ");
		for(String curr : str){
		if(curr.length() % 2==0)
		{
			System.out.println(curr);
		}
		}
	}
}