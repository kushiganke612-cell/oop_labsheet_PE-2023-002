
package trackersystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    private static final String URL =
            "jdbc:mysql://localhost:3306/task_tracker_db";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            return DriverManager.getConnection(
                    URL, USER, PASSWORD);

        } catch (Exception e) {
            System.out.println("Connection Error : "
                    + e.getMessage());
            return null;
        }
    }
}