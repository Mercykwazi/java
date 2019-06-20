package com.mercy.storageApp;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@Component
public class Database {
    DatasourceConfig config=new DatasourceConfig();
    public Connection connect() {
        Connection conn = null;
        Statement stmt = null;

        config.datasource();
        System.out.println("Connected to the PostgreSQL server successfully.");

        return conn;
    }
}


