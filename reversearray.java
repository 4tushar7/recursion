import java.util.*;
class reversearray
{
 static void rev(int[] arr,int i,int j)
 {
 	if(i>=j)
 	{
 		return ;
 	}
 	else
 	{
 		int temp;
 		temp=arr[i];
 		arr[i]=arr[j];
 		arr[j]=temp;
 		rev(arr,i+1,j-1);
 	}
 }
 public static void main(String[] args)
 {
 	Scanner s=new Scanner(System.in);
 	System.out.println("Enter size of array : ");
 	int n=s.nextInt();
 	int[] arr=new int[n];
 	for(int i=0;i<n;i++)
 	{
 		arr[i]=s.nextInt();
 	}
 	rev(arr,0,n-1);
 	System.out.println("Reverse of Array : ");
 	for(int i=0;i<n;i++)
 	{
 		System.out.println(arr[i]+" ");
 	}
 }
}