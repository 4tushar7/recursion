import java.util.*;
class duplireduce
{
	public static String dupli(String str)
	{
		if(str.length()<=1)
		{
			return str;
		}
		if(str.substring(1,2).equals(str.substring(0,1)))
		{
			return dupli(str.substring(1));
		}
		else
		{
			return str.substring(0,1)+dupli(str.substring(1));
		}
	}
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter String : ");
		String str2=in.next();
		String m=dupli(str2);
		System.out.println(m);
	}
}