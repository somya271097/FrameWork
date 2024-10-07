package Generic_utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class File_Utility {
	/**
	 * This method is used to read data from properties file
	 * @param Key
	 * @return
	 * @throws Throwable
	 */
	public String getKeyAndValuePair(String Key) throws Throwable
	{
		FileInputStream fis = new FileInputStream(IPathConstants.filePath);

		//step2:- load all the keys to Properties class
		Properties pro = new Properties();
		pro.load(fis);
	
		//Step3:- call keys from properties file
		String Value = pro.getProperty(Key);
		return Value;
	}

}
