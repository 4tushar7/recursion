import java.util.*;
class balanced
{
	static boolean func(String s,int start,int end)
	{
		if(start==s.length())
		{
			return end==0;
		}
		if(end<0)
		{
			return false;
		}
		if(s.charAt(start)=='('||s.charAt(start)=='['||s.charAt(start)=='{')
		{
			return func(s,start+1,end+1);
		}
		if(s.charAt(start)==')'||s.charAt(start)==']'||s.charAt(start)=='}')
		{
			return func(s,start+1,end-1);
		}
		return func(s,start+1,end);
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		boolean flag=func(str,0,0);
		if(flag==true)
		{
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("Not Balanced");
		}
	}
}