package hexaware.dao;
import java.sql.*;
import java.util.Properties;
import hexaware.util.DBConnUtil;
import hexaware.util.DBPropertyUtil;
public class DAO 
{
	public static void main(String[] args)throws Exception 
	{
		Properties p=DBPropertyUtil.getConnectionString("dbase.properties");
		Connection con=DBConnUtil.getConn(p);
		System.out.println("Connection is established");
	}

}
