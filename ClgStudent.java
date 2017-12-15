class ClgStudent extends Student
{
	int year;
	String department;
	ClgStudent(int year,String department)
	{
		super(28);
		this.year=year;
		this.department=department;
	}
	void disp()
	{
		System.out.println("Student name:"+this.name+" "+"Year:"+this.year+" "+"Department:"+this.department);
	}
}