import java.util.*;
public class def_list 
{
	public static void main(String args[])
	{
		List<Integer> list1= new ArrayList<Integer>();
		list1.add(1);
		list1.add(28);
		list1.add(16);
		list1.add(25);
		list1.add(13);
		list1.add(24);
		list1.add(21);
		list1.add(11);
		
		System.out.println(list1);
		
		list1.add(7,450);
		System.out.println(list1);
	}
}

