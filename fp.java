import java.util.*;
class fp{
	public static void main(String args[])
	{
		char b[]={'a','b','c','d','e'};
		int b1[]={0,0,0,0,0,};
		String a[]={"bead","ba","bead","bea","beac","bcd"};
		int min=4,i,j,p,c=0;
		for(i=0;i<5;i++)
		{
			for(j=0;j<a.length;j++)
			{
				for(p=0;p<a[j].length();p++)
				{
					if(b[i]==a[j].charAt(p))
					{
						c=c+1;
					}
				}
			}
			b1[i]=c;
			c=0;
		}
		System.out.println("Input Strings:");
		for(j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
		for(i=0;i<b1.length;i++)
		{
			System.out.println(b[i]+" Support:"+b1[i]);
		}
		System.out.println("Minimum Support:"+min+"\n After Eliminating element having less support than minimum support:");
		for(i=0;i<b1.length;i++)
		{
			if(b1[i]>=min)
			{
			}
			else
			{
				b1[i]=0;
			}
		}
		for(i=0;i<b1.length;i++)
		{
			System.out.println(b[i]+" Support:"+b1[i]);
		}
		System.out.println("FP Tree Paths:");
		for(j=0;j<a.length;j++)
		{
			System.out.print("\n Root:");
			for(p=0;p<a[j].length();p++)
			{
				for(i=0;i<5;i++)
				{
					if(b[i]==a[j].charAt(p) && b1[i]!=0)
					{
						System.out.print(a[j].charAt(p)+"->");
					}
				}
			}
			System.out.print("Null");
		}
	}
}
