package app.com.main;

import java.sql.SQLException;

public class JdbcConnection {

    public static void main(String[] args) throws ClassNotFoundException,SQLException{
        getConnection();
    }

    public static void getConnection() throws ClassNotFoundException {

        System.out.println("JdbcConnection.getConnection()");
        Class.forName("");
        System.out.println("SSS");
    }

}
