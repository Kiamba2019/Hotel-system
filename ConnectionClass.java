package hotelprototype;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Engineer
 */
public class ConnectionClass {

    Connection conn = null;

    public Connection connectDb() {
        try {
            String databasename = "hotelmanager";

            String password = "";

            String url = "jdbc:mysql://localhost:3306/";

            String username = "root";

            String driver = "com.mysql.jdbc.Driver";

            Class.forName(driver);
            conn = DriverManager.getConnection(url + databasename, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
        return conn;
    }
}
