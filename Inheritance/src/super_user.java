
class A
{
	int c;
	A(int a, int b)
	{
		c = a+b;
	}
	void show()
	{
		System.out.println(c);
	}
}

class B extends A
{
	B(int a, int b)
	{
		super(a,b);
		super.show();
	}
}
public class super_user 
{
	public static void main(String args[]) 
	{
		new B(10,12);
	}
}
