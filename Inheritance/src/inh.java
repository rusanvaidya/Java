interface person
{
	String name = "Ram";
	String address = "Balkumari";
	String college = "NCIT";
}

class student implements person
{
	int roll = 12;
	String faculty = "BEIT";
	int semester = 7;
	
	void show()
	{
		System.out.println("Name : "+name+"\nAddress : "+address+"\nCollege : "+college+"\nRoll :"+roll);
	}
}
public class inh extends student
{
	public static void main(String args[]) 
	{
		inh t = new inh();
		t.show();		
	}
}
