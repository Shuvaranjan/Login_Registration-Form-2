package BACKEND;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import CONSTANTS.Common_Constants;

public class Database2 {
    // All Backend Codes
    public static boolean Submit(String full_name, String date, String email, String ph,
            String address, String position, String emp_desired, String school_name, String state_name,
            String from, String to, String college_name, String state_name2, String from2,
            String to2, String graduate, String degree) {
        // first check this data alredy exists in the DB(database)
        // we will make a seprate method to check if the user already exists
        try {
            Connection con = DriverManager.getConnection(Common_Constants.DB_URL2, Common_Constants.DB_USERNAME,
                    Common_Constants.DB_PASSWORD);
            PreparedStatement insert = con.prepareStatement( 
                "INSERT INTO " + Common_Constants.DB_USER_TABLE2 + "(`full_name`,\n" + //
                "`date`,\n" + //
                "`email`,\n" + //
                "`ph`,\n" + //
                "`address`,\n" + //
                "`position`,\n" + //
                "`emp_desired`,\n" + //
                "`school_name`,\n" + //
                "`state_name`,\n" + //
                "`from`,\n" + //
                "`to`,\n" + //
                "`college_name`,\n" + //
                "`state_name2`,\n" + //
                "`from2`,\n" + //
                "`to2`,\n" + //
                "`graduate`,\n" + //
                "`degree`)\n" + //
                "VALUES\n" + //
                "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"
                    
                    
                    );

            insert.setString(1, full_name);
            insert.setString(2, date);
            insert.setString(3, email);
            insert.setString(4, ph);
            insert.setString(5, address);
            insert.setString(6, position);
            insert.setString(7, emp_desired);
            insert.setString(8, school_name);
            insert.setString(9, state_name);
            insert.setString(10, from);
            insert.setString(11, to);
            insert.setString(12, college_name);
            insert.setString(13, state_name2);
            insert.setString(14, from2);
            insert.setString(15, to2);
            insert.setString(16, graduate);
            insert.setString(17, degree);
            // Update Database with new User
            insert.executeUpdate();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;

    }

    /*
     * public static boolean validate(String full_name, String date, String email,
     * String ph,
     * String address, String position, String emp_desired, String school_name,
     * String state_name,
     * String from, String to, String college_name, String state_name2, String
     * from2,
     * String to2, String graduate, String degree) {
     * 
     * try {
     * Connection con = DriverManager.getConnection(Common_Constants.DB_URL2,
     * Common_Constants.DB_USERNAME,
     * Common_Constants.DB_PASSWORD);
     * 
     * PreparedStatement validate = con.prepareStatement(
     * "SELECT * FROM " + Common_Constants.DB_USER_TABLE2
     * +
     * " WHERE full_name = ? AND WHERE date = ?  WHERE email = ?  WHERE ph = ? WHERE address = ?  WHERE position = ?  WHERE emp_desired = ?   WHERE school_name = ?  WHERE state_name = ?  WHERE from = ?  WHERE to = ?  WHERE college_name = ? WHERE state_name2 = ?  WHERE from2 = ?  WHERE to2 = ?  WHERE graduate = ?  WHERE degree = ?"
     * );
     * 
     * 
     * validate.setString(1, full_name);
     * validate.setString(2, date);
     * validate.setString(3, email);
     * validate.setString(4, ph);
     * validate.setString(5, address);
     * validate.setString(6, position);
     * validate.setString(7, emp_desired);
     * validate.setString(8, school_name);
     * validate.setString(9, state_name);
     * validate.setString(10, from);
     * validate.setString(11, to);
     * validate.setString(12, college_name);
     * validate.setString(13, state_name2);
     * validate.setString(14, from2);
     * validate.setString(15, to2);
     * validate.setString(16, graduate);
     * validate.setString(17, degree);
     * ResultSet rSet = validate.executeQuery();
     * if (!rSet.isBeforeFirst()) {
     * return false;
     * }
     * 
     * } catch (SQLException e) {
     * e.printStackTrace();
     * }
     * 
     * return true;
     * 
     * 
     * 
     * }
     */

}
