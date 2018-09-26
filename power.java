import java.util.*;
class power1
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter base and power");
		int base=s.nextInt();
		int raisepower=s.nextInt();
		int result=power(base,raisepower);
		System.out.println(result);
	}
	public static int power(int base,int raisepower)
	{
		if(raisepower!=0)
		{
			return(base*power(base,raisepower-1));
		}
		else
		{
			return 1;
		}
	}
}