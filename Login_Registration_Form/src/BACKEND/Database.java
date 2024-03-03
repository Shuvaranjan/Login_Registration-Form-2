package BACKEND;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import CONSTANTS.Common_Constants;

public class Database {
    // All Backend Codes
    // we will first start with registering new users to our Database
    public static boolean Register(String Username, String Password){
          // first check if the username alredy exists in the DB(database)
        // we will make a seprate method to check if the user already exists
        try {
             // the logic is that we will only register if the user does't found in the DB
             if (!CheckUser(Username)) {
                // connection to the database
                Connection connection = DriverManager.getConnection(Common_Constants.DB_URL, Common_Constants.DB_USERNAME, Common_Constants.DB_PASSWORD);

                // Create INSERT Querry
                PreparedStatement insertUser = connection.prepareStatement(
                    "INSERT INTO " + Common_Constants.DB_USER_TABLE + "(Username, Password)" + "VALUES (?,?)"
                );

                insertUser.setString(1, Username);
                insertUser.setString(2, Password);

                // Update Database with new User
                insertUser.executeUpdate();
                return true;

             }
        } catch (SQLException e) {
          e.printStackTrace();
        }


        return false;
      
       


    }
    // check if username already exists in the DB
    // false - user does't exists in the DB
    // true - user exists in the DB
    public static boolean CheckUser(String Username){
        try {
            // Database Connect
            Connection connection = DriverManager.getConnection(Common_Constants.DB_URL, Common_Constants.DB_USERNAME, Common_Constants.DB_PASSWORD);

            PreparedStatement CheckUserExist = connection.prepareStatement(
                "SELECT * FROM " + Common_Constants.DB_USER_TABLE + " WHERE USERNAME = ?" 
            );
             // we will replace the "?" with values using the setString()
             CheckUserExist.setString(1, Username);

             
            // then we will store our Result in a resultSet which will be able to access
           ResultSet resultSet = CheckUserExist.executeQuery();


             // check to see if the resultSet is empty
            // if it is empty it means that there was no data roe that contains the username
            // (Ex - user does't exists)
            // we use the isBeforeFirst() to point the first row of data that is returned to
            // our resultSet
            if (!resultSet.isBeforeFirst()) {
                return false;
                
            }

            
             
    }
    catch (SQLException e){
        e.printStackTrace();
    }
     // if the user does't exists in DB
    return true;
}
  // validate user login
    // validate login credintials by checking to see if username/passwords pair
    // exists in the DB
   public static boolean ValidateLogin(String Username, String Password){
    try {
        Connection connection = DriverManager.getConnection(Common_Constants.DB_URL, Common_Constants.DB_USERNAME, Common_Constants.DB_PASSWORD);

        // Create Select Querry
        PreparedStatement validateUser = connection.prepareStatement(
            "SELECT * FROM " + Common_Constants.DB_USER_TABLE + " WHERE USERNAME = ? AND PASSWORD = ?"
        );
        validateUser.setString(1, Username);
        validateUser.setString(2, Password);

        ResultSet resultSet = validateUser.executeQuery();

        //isBeforeFirst() is used here to see if your query returned any rows that matched our querry
        if (!resultSet.isBeforeFirst()) {
            return false;
        }

    } catch (SQLException e) {
       e.printStackTrace();
    }
    // if it is true it means that there was a username/password pair that match the user input
    return true;
   }
}
