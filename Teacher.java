class Teacher extends Person
{
	double salary;
	String subject;
	Teacher(double salary,String subject)
	{
		super("Madhu");
		this.salary=salary;
		this.subject=subject;
	}
	void disp()
	{
		System.out.println("Teacher name:"+this.name+" "+"Salary:"+this.salary+" "+"Subject:"+this.subject);
	}
	public static void main(String args[])
	{
		Teacher t=new Teacher(25000.90,"Maths");
		t.disp();
		ClgStudent c=new ClgStudent(3,"ECE");
		c.disp();
	}
}
