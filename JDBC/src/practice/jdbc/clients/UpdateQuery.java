package practice.jdbc.clients;

import static practice.jdbc.constants.ConnectionConstants.JDBC_MYSQL_URL;
import static practice.jdbc.constants.ConnectionConstants.PASSWORD;
import static practice.jdbc.constants.ConnectionConstants.USERNAME;
import static practice.jdbc.constants.QueryConstants.INSERT_QUERY;
import static practice.jdbc.constants.QueryConstants.UPDATE_QUERY;
import static practice.jdbc.constants.QueryConstants.DELETE_QUERY;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateQuery {

	public static void main(String[] args) {
		Connection connection = null;
		
		try {
			
			//get the connection by giving url, username and password. Ensure that jdbc driver is there in the project's build path.
			connection = DriverManager.getConnection(JDBC_MYSQL_URL, USERNAME, PASSWORD);
		
			//get the statement, you can create prepareStatement instead of statement. Prepare statement gives more security.
			Statement statement = connection.createStatement();
			
			//executeUpdate() method is used for CRUD operations like CReate, Update and Delete

			//executing insert query
			int insertedRows = statement.executeUpdate(INSERT_QUERY);
			//printing table
			SelectQuery.main(null);
			System.out.println(insertedRows + " Row(s) inserted");
			
			
			//executing update query
			int updatedRows = statement.executeUpdate(UPDATE_QUERY);
			//printing table
			SelectQuery.main(null);
			System.out.println(updatedRows + " Row(s) updated");
			
			
			//executing delete query
			int deletedRows = statement.executeUpdate(DELETE_QUERY);
			//printing table
			SelectQuery.main(null);
			System.out.println(deletedRows + " Row(s) deleted");
			

		} catch (SQLException e) {
			System.out.println("Exception occured:");
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
