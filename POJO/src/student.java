import com.stud_info.*;
import java.util.*;

public class student 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER NAME : ");
		String n = sc.next();
		System.out.print("ENTER ROLL : ");
		int r = sc.nextInt();
		System.out.print("ENTER COLLEGE : ");
		String c = sc.next();
		System.out.print("ENTER ADDRESS : ");
		String a = sc.next();
		sc.close();
		
		student_info s = new student_info(c ,a);
		s.setName(n);
		s.setRoll(r);
		
		String name = s.getName();
		int roll = s.getRoll();
				
		System.out.println("NAME : "+name);
		System.out.println("ROLL : "+roll);
		System.out.println("COLLEGE : "+s.college);
		System.out.println("ADDRESS : "+s.address);
	}
}
