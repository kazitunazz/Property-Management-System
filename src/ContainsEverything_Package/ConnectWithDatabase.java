
package ContainsEverything_Package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectWithDatabase {
    Connection connection;
    public static String UserId="1A",UserType;
    public void connectDB(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Database_Project;selectMethod=cursor", "sa", "123456");
            
            System.out.println("DATABASE NAME IS:"+ connection.getMetaData().getDatabaseProductName());
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT ApartmentNo, NoOfRooms, Bedroom, " +
"Washroom, ApartmentSize,PriceInLacs " +
"FROM Apartment " +
"WHERE Status='Vacant' OR Status='For Sale'");
            while (resultSet.next()) {
                //System.out.println(resultSet.getString("ApartmentNo"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
}
