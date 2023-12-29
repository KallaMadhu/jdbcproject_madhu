package hexaware.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
public class DBConnUtil
{
	public static Connection getConn(Properties props)throws Exception
	{
		Connection con=null;
		Class.forName(props.getProperty("driver"));
		con=DriverManager.getConnection(props.getProperty("url"), props.getProperty("user"),props.getProperty("password"));
		return con;
	}
}
