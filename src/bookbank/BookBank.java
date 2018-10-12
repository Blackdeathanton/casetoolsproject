/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookbank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

/**
 *
 * @author Anton
 */
public class BookBank {
    private static Connection connection;
    static Statement statement;
    
    
    public static void main(String[] args) throws Exception {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        connection = DriverManager.getConnection("jdbc:derby://localhost:1527/OOAD", "root", "root");
        statement  = connection.createStatement();
        Index newIndex = new Index();
        newIndex.setVisible(true);
    }
    
}
