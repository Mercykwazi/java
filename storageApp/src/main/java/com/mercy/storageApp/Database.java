package com.mercy.storageApp;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@Component
public class Database {
    DatasourceConfig config=new DatasourceConfig();

//    private final String url = "jdbc:postgresql://localhost/storage";
//    private final String user = "postgres";
//    private final String password = "Gugulethu";

    public Connection connect() {
        Connection conn = null;
        Statement stmt = null;
        //            Class.forName("org.postgresql.Driver");
//            conn = DriverManager.getConnection(url, user, password);
        config.datasource();
        System.out.println("Connected to the PostgreSQL server successfully.");

        return conn;
    }
}


