import java.util.*;
class sum
{
	int sumstring(int n)
	{
		if(n==0)
			return 0;
		return(n%10+sumstring(n/10));
	}
}
class sumofdigit
{
	public static void main(String[] args)
	{
		String c1,c2;
		int a,b;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter digit String");
		c1=in.next();
		a=Integer.parseInt(c1);
		sum s=new sum();
		b=s.sumstring(a);
		System.out.println("Sum is");
		System.out.println(b);
	}
}