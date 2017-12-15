class DogOwner extends Dog
{
	void takeForWalk()
	{
		if(condition)
		{
			System.out.println("testDogWalk2:"+condition);
		}
		else
		{
			System.out.println("testDogWalk2:false");
		}
	}
}
class TestDrive
{
public static void main(String args[])
{
	DogOwner d=new DogOwner();
	d.setDrinkTime(5);
	d.getDrinkTime();
	d.needsToGo();
	d.takeForWalk();
}
}
