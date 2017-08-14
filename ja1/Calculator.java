public class Calculator
{	int x,y;
	Calculator(int a,int b)
	{
		x=a;
		y=b;
	}
	public int sum()
	{
		return x+y;
	}
	public int sub()
	{return x-y;
	}
	public int divide()
	{if(y==0)
	{
		System.out.println("division with zero");
	return;
	}
	else	
		return x/y;
	}

	public int mutiply()
	{return x*y;
	}
	public static void main(String as[])
	{
	Calculator ob=new Calculator(Integer.parseInt(as[0]),Integer.parseInt(as[1]));
	
	System.out.println(ob.sum());
	System.out.println(ob.sub());
	System.out.println(ob.divide());
	System.out.println(ob.multiply());
	}
}