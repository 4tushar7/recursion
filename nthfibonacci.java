import java.util.*;
class fibbonacci
{
	int fibbo(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else if(n==1)
		{
			return 1;
		}
		else
		{
			return fibbo(n-1)+fibbo(n-2);
		}
	}
}
class nthfibonacci
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int pos;
		System.out.println("Enter the position");
		pos=s.nextInt();
		fibbonacci f=new fibbonacci();
		int i=f.fibbo(pos);
		System.out.println("The number is");
		System.out.println(i);
	}
}