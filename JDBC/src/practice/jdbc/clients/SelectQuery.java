package practice.jdbc.clients;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static practice.jdbc.constants.ConnectionConstants.JDBC_MYSQL_URL;
import static practice.jdbc.constants.ConnectionConstants.USERNAME;
import static practice.jdbc.constants.ConnectionConstants.PASSWORD;
/*
 * This class just executes a select query and prints the results.
 * A table "user" has two columns. 
 * 	1) id - int
 *  2) name - string
 *   
 */
public class SelectQuery{
	

	public static void main(String[] args) {
		Connection connection = null;
		
		try {
			
			//get the connection by giving url, username and password. Ensure that jdbc driver is there in the project's build path.
			connection = DriverManager.getConnection(JDBC_MYSQL_URL, USERNAME, PASSWORD);
			
			//get the statement, you can create prepareStatement instead of statement. Prepare statement gives more security.
			Statement statement = connection.createStatement();
			
			//executeQuery() method is used for queries that returns rows i.e select queries.
			ResultSet resultset = statement.executeQuery("select * from users");
			
			//iterate resultset to get values of rows. At first resultset's  cursor is pointed to before first row, calling next method moves the cursor over rows.  
			while(resultset.next()){
				
				//get the first column value. you can use getInt("id") as well if you know column name.
				int id = resultset.getInt(1);
				
				//get the second column value, you can use getString("name") as well if you know column name.
				String name = resultset.getString(2);
				
				System.out.println(id + " : " + name);
			}
		} catch (SQLException e) {
			System.out.println("Exception occured : ");
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
