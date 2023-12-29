package hexaware.util;

import java.io.FileInputStream;
import java.util.Properties;

public class DBPropertyUtil {
	public static Properties getConnectionString(String propFileName)throws Exception
	{
		FileInputStream fis=new FileInputStream(propFileName);
		Properties props=new Properties();
		props.load(fis);
		return props;
	}
}
