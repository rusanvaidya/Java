import java.util.*;
public class def_set 
{
	public static void main(String args[])
	{
		Set<String> s = new HashSet<String>();
		s.add("a");
		s.add("x");
		s.add("v");
		s.add("t");
		s.add("y");
		s.add("i");
		
		System.out.println(s);
		System.out.println("Removing x from set we get -> "+s.remove("x"));
		System.out.println("Does i belong in this set? "+s.contains("i"));
		
		System.out.println(s);
	
	}
}
