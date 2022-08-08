import java.util.Scanner;

public class ArrayOfLength {
	int i;
	public  void showLenght(int a[])
	{
		for(i=0;i<a.length;i++) 
		{
			System.out.println("array index "+i+" positon"+" "+a[i]);
		}

	}
	public static void main(String[] args) {
		ArrayOfLength al=new ArrayOfLength();
		Scanner sc=new Scanner(System.in);
		int arr[];
		System.out.println("Enter lenght");
		int len=sc.nextInt();
		arr=new int[len];
		System.out.print("Enter Element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		al.showLenght(arr);
	}

}
