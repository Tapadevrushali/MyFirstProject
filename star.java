package hello;

public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4,spc;
		spc=n+4-1;
    for(int i=1;i<=4;i++)
    {
    	for(int k=spc;k>=1;k--)
    		System.out.print(" ");
    	for(int j=1;j<=i;j++)
    	{
    		System.out.print("*"+" ");
    	}
    	System.out.println();
    	spc--;
    }
	}

}
