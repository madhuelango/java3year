class Dog
{
	int drinkTime;
	boolean condition;
	void setDrinkTime(int drinkTime)
	{
		this.drinkTime=drinkTime;
	}
	int getDrinkTime()
	{
		return drinkTime;
	}
	void needsToGo()
	{
		if(this.drinkTime>=4)
		{
			condition=true;	
			System.out.println("testDogWalk1:"+condition);
		}
		else
		{
			System.out.println("testDogWalk1:false");
		}	
	}
}