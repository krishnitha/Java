import java.util.Scanner;
class array
{
	int m[] = new int[5];
	void arr(int a, int j)
	{
		try
		{
			m[j]=a;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array is full\n"  + e );
		}
	}
}
public class ArrayException {
	public static void main(String[] args) 
	{
		int n;
		array ar = new array();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the array elements");
		for(int i=0; ; i++)
		{
			n = sc.nextInt();
			ar.arr(n, i);
		}
	}
}


