import com.hana.frame.ConnectionPool;

import java.sql.SQLException;

public class ConnectionPoolTest {
    public static void main(String[] args) {
        ConnectionPool cp = null;
        try {
            cp = ConnectionPool.create();
            System.out.println(cp.getSize());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}