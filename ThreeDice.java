
public class ThreeDice {
	
	private  Dice D1,D2,D3;
	
	public  int Throw()
	{
		int randomDice;
		randomDice = (D1.Throw(1)+D2.Throw(1)+D3.Throw(1))/3;			
		return randomDice;
	}
}
