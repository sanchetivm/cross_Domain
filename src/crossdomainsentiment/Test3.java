/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crossdomainsentiment;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author ADMIN
 */
public class Test3 {

private static String vrms;
private static String irms;
private static String total;

public static Connection getConnection() {
try {
String driver = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/test3";
String username = "root";
String password = "";

Class.forName(driver);
Connection conn = DriverManager.getConnection(url, username,password);
System.out.println("Connection Established");
return conn;
} catch (Exception e) {
System.out.println("Connection not established");
return null;
}   }
public static void main(String[] args) throws IOException, SQLException {

PreparedStatement preparedstatement = null;
    Connection connection = null;


try{
    String read=null;
    FileInputStream fstream = new FileInputStream("D:/VIJAY/New folder/Sushma/Medical.txt");
DataInputStream in = new DataInputStream(fstream);
BufferedReader br = new BufferedReader(new InputStreamReader(in));
    //in = new BufferedReader(new FileReader("patientlist.txt")); 
    while ((read = in.readLine()) != null) {
        String[] splited = read.split("\\s+");
        String name = splited[0];
        String age = splited[1];
        String height = splited[2];
        String weight = splited[3];      
        addpatient(connection, preparedstatement, name, age, height, weight);
    }

}
catch (IOException e) {System.out.println("There was a problem: " + e);}
    if (connection != null)
    try{connection.close();} catch(SQLException ignore){} 
}


public static void addpatient(Connection connection, PreparedStatement preparedstatement, String name, String age, String height, String weight) throws SQLException{
preparedstatement=connection.prepareStatement("insert into meter1(name, age, height, weight) values(?,?,?,?)");
preparedstatement.setString(1, name);
preparedstatement.setString(2, age);
preparedstatement.setString(3, height);
preparedstatement.setString(4, weight);
preparedstatement.executeUpdate();


}
}