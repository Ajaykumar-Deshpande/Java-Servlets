package com.xworkz.cable.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CableRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/cable";
		String userName = "root";
		String password = "Ajay@787898";
		String insertQuery = "INSERT INTO cable_table VALUES (1, 'HDMI', '15.99'),(2, 'USB-C', '9.99'),(3, 'Ethernet', '12.49'),(4, 'Lightning', '19.99'),(5, 'VGA', '7.99'),(6, 'DisplayPort', '22.50'),(7, 'Coaxial', '5.49'),(8, 'Auxiliary', '3.99'),(9, 'Power Cable', '8.99'),(10, 'HDMI', '17.99'),(11, 'USB-A', '6.99'),(12, 'USB-B', '10.50'),(13, 'USB-C', '13.99'),(14, 'Micro-USB', '4.49'),(15, 'Lightning', '21.99'),(16, 'Optical Audio', '25.00'),(17, 'DVI', '11.99'),(18, 'FireWire', '14.99'),(19, 'Ethernet', '16.99'),(20, 'Power Cable', '9.49')";
		String updateQuery1 = "UPDATE cable_table SET cable_price = '16.00' WHERE id = 1";
		String updateQuery2 = "UPDATE cable_table SET cable_price = '10.00' WHERE id = 2";
		String updateQuery3 = "UPDATE cable_table SET cable_price = '13.00' WHERE id = 3";
		String updateQuery4 = "UPDATE cable_table SET cable_price = '20.00' WHERE id = 4";
		String updateQuery5 = "UPDATE cable_table SET cable_price = '8.50' WHERE id = 5";
		String updateQuery6 = "UPDATE cable_table SET cable_price = '23.00' WHERE id = 6";
		String updateQuery7 = "UPDATE cable_table SET cable_price = '6.00' WHERE id = 7";
		String updateQuery8 = "UPDATE cable_table SET cable_price = '4.50' WHERE id = 8";
		String updateQuery9 = "UPDATE cable_table SET cable_price = '9.50' WHERE id = 9";
		String updateQuery10 ="UPDATE cable_table SET cable_price = '18.00' WHERE id = 10";

		String deleteQuery1 = "delete from cable_table where id=11";
		String deleteQuery2 = "delete from cable_table where id=12";
		String deleteQuery3 = "delete from cable_table where id=13";
		String deleteQuery4 = "delete from cable_table where id=14";
		String deleteQuery5 = "delete from cable_table where id=15";
		String deleteQuery6 = "delete from cable_table where id=16";
		String deleteQuery7 = "delete from cable_table where id=17";
		String deleteQuery8 = "delete from cable_table where id=18";
		String deleteQuery9 = "delete from cable_table where id=19";
		String deleteQuery10 ="delete from cable_table where id=20";
		
		Connection connection=null;

		try {
			connection = DriverManager.getConnection(url, userName, password); 
		Statement statement=connection.createStatement();
			int value = statement.executeUpdate(deleteQuery10);
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
