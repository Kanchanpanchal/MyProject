
public class ArrayElement {
int a[]= {1,2,3,4,5};
int b[]= {1,4,3,12,6,4,9};
public void Comman()
{
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			if(a[i]==b[j])
			{
				System.out.println("Comman element in array"+" "+a[i]);
				
			}
		}
	}
			
}
	public static void main(String[] args) {
 
		ArrayElement ae=new ArrayElement();
		ae.Comman();
		

	}

}
