import java.util.*;

class Student
{
	int rn;
	String name;
	double per;

	void getData(int r,String nm,double p)
	{
		rn = r;
		name = nm;
		per = p;
	}

	void putData()
	{
		System.out.println("Roll no = " + rn);
		System.out.println("Name = " + name);
		System.out.println("Per = " + per);
	}
}

class SimpleClass
{
	public static void main(String s[])
	{
		Student s1 = new Student();
		s1.getData(1, "Piyush", 72.70);
		s1.putData();

		Student s2;
		s2 = new Student();
		s2.getData(2, "Shah", 85);
		s2.putData();
	}
}