package com.xworkz.chargers.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ChargerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/chargers";
		String userName = "root";
		String password = "Ajay@787898";
		String insertQuery ="INSERT INTO chargers_table VALUES (1,'Fast Charger', 19.99),(2,'Wireless Charger', 25.49),(3,'USB-C Charger', 14.99),(4,'MagSafe Charger', 29.99),(5,'Car Charger', 12.99),(6,'Wall Charger', 9.99),(7,'Portable Charger', 39.99),(8,'Solar Charger', 49.99),(9,'Lightning Charger', 18.99),(10,'Dual USB Charger', 15.49),(11,'Type-C Power Adapter', 23.00),(12,'Quick Charge 3.0', 17.99),(13,'Power Bank Charger', 29.50),(14,'Bluetooth Charger', 22.00),(15,'Power Delivery Charger', 24.99),(16,'Universal Charger', 16.50),(17,'12V Car Charger', 11.00),(18,'Laptop Charger', 45.00),(19,'Charging Dock', 34.99),(20,'Smart Charger', 27.99)";
		
		String updateQuery1 = "UPDATE chargers_table SET chargers_price = '20.00' WHERE id = 1";
		String updateQuery2 = "UPDATE chargers_table SET chargers_price = '26.00' WHERE id = 2";
		String updateQuery3 = "UPDATE chargers_table SET chargers_price = '15.50' WHERE id = 3";
		String updateQuery4 = "UPDATE chargers_table SET chargers_price = '30.00' WHERE id = 4";
		String updateQuery5 = "UPDATE chargers_table SET chargers_price = '13.50' WHERE id = 5";
		String updateQuery6 = "UPDATE chargers_table SET chargers_price = '10.50' WHERE id = 6";
		String updateQuery7 = "UPDATE chargers_table SET chargers_price = '40.00' WHERE id = 7";
		String updateQuery8 = "UPDATE chargers_table SET chargers_price = '50.50' WHERE id = 8";
		String updateQuery9 = "UPDATE chargers_table SET chargers_price = '19.50' WHERE id = 9";
		String updateQuery10 = "UPDATE chargers_table SET chargers_price = '16.00' WHERE id = 10";
		
		String deleteQuery1 = "delete from chargers_table where id=11";
		String deleteQuery2 = "delete from chargers_table where id=12";
		String deleteQuery3 = "delete from chargers_table where id=13";
		String deleteQuery4 = "delete from chargers_table where id=14";
		String deleteQuery5 = "delete from chargers_table where id=15";
		String deleteQuery6 = "delete from chargers_table where id=16";
		String deleteQuery7 = "delete from chargers_table where id=17";
		String deleteQuery8 = "delete from chargers_table where id=18";
		String deleteQuery9 = "delete from chargers_table where id=19";
		String deleteQuery10 ="delete from chargers_table where id=20";
		
		Connection connection=null;

		try {
			connection = DriverManager.getConnection(url, userName, password); 
		Statement statement=connection.createStatement();
			int value = statement.executeUpdate(updateQuery9);
			if (value > 0) {
				System.out.println("this is saved");
			} else {
				System.out.println("this is not saved");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		
	}


	}

}
