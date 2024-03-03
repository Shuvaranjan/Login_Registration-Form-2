package CONSTANTS;

import java.awt.Color;

public class Common_Constants {

    // hex color values
    public static final Color PRYMARY_COLOR = Color.decode("#F4F3F3");
    public static final Color SECONDARY_COLOR = Color.decode("#EC1313");
    public static final Color TEXT_COLOR = Color.decode("#FFFFFF");
    public static final Color TEXT_FIELD_COLOR = Color.decode("#434141");

    // SQL queries
    public static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/login_registration_scema";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "shuvaranjan2004";
    public static final String DB_USER_TABLE = "users_table";

    // SQL queries for application Gui
    public static final String DB_URL2 = "jdbc:mysql://127.0.0.1:3306/application_shema";
    public static final String DB_USER_TABLE2 = "store_data";
}
