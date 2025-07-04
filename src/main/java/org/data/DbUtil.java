package org.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

    public static Connection connect(String dataBaseName) throws SQLException {
        return DriverManager.getConnection(Data.getUrl(dataBaseName), Data.USER, Data.PASS);
    }

}
