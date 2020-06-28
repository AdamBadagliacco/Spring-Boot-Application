package com.renadam.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnectionHandler {
		
	public static boolean enterCodeIntoDatabase(int code){
		
		//Open connection to database
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException e)
        {
            System.err.println("Error when loading DB driver:");
            System.err.println(e);
        }
        
        //Establish database connection
        Connection conn = null;
        try
        {
            final String url = "XXXX";
            //final String username = prompt("Username: ");
            final String username = "XXXX";
            //final String password = promptHidden("Password: ");
            final String password = "XXXX";
            conn = DriverManager.getConnection(url, username, password);
           // System.out.println("Connection to database established.");
        }
        catch (SQLException e)
        {
            System.err.println("SQL exception: " + e.getMessage());
            System.err.println("SQL state: " + e.getSQLState());
            System.err.println("Error code: " + e.getErrorCode());
        }

        if (conn != null)
        {
            try
            {
                //Set up the SQL statement (with a parameter)
                //Record new score in database
                    String command = "INSERT INTO dnddatatwo (GameCode, Data) " +
                       "VALUES (?, ?)";
                    PreparedStatement stmt;
                    
                    stmt = conn.prepareStatement(command);
                    stmt.setInt(1, code);
                    stmt.setString(2, "This is Temporary Data");
                    //stmt.setInt(3, score);
                       //set parameters (student code)
                    stmt.executeUpdate();
                    System.out.println("Score inserted into database.");

                //Close database connection
                conn.close();
                //System.out.println("Database connection closed.");
                return true; //Return true to verify the score was inserted correctly
            }
            catch (SQLException e)
            {
                System.err.println("SQL exception: " + e.getMessage());
                System.err.println("SQL state: " + e.getSQLState());
                System.err.println("Error code: " + e.getErrorCode());
                return false; // returns false because the score generated was the same as an existing one
            }
        }
		return true; //Return true, score was not inserted correctly most likely due to connection issues
	}
	
	public static String getData(String code){
		return "temp";
	}
	
	
	//public static void enterCodeIntoDatabase(){
	//	enterCodeIntoDatabase(CodeHandler.generateCode());
	//}
	
	
}
