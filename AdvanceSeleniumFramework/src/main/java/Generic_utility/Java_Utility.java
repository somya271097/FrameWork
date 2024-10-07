package Generic_utility;

import java.util.Random;

public class Java_Utility {
	/**
	 * This method is used to avoid duplicate
	 * @return
	 */
	public int getRandomNum()
	{
		Random ran = new Random();
		int ranNum = ran.nextInt(1000);
		return ranNum;
	}

	
	

}
