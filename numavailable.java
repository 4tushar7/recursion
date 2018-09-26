import java.util.*;
class search
{
	int src(int ar[],int l,int r,int x)
	{
		if(r<1)
		{
			return -1;
		}
		if(ar[l] == x)
		{
			return l;
		}
		return src(ar,l+1,r,x);
	}
}
class numavailable
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int i,x,fn,n;
		System.out.println("Enter the array size and elements");
		n=s.nextInt();
		int[] arr=new int[n];
		for(i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
        System.out.println("Enter number to search");
        x=s.nextInt();
        search sc=new search();
        fn=sc.src(arr,0,arr.length-1,x);
        if(fn!=-1)
        {
        	System.out.println("Element "+x+" is present at index "+(fn+1));
        }
        else
        {
        	System.out.println("Element "+x+" is not present");
        }
	}
}