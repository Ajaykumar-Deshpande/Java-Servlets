package com.xworkz.bag.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BagRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/bag";
		String userName = "root";
		String password = "Ajay@787898";
		String insertQuery = "INSERT INTO bag_table VALUES (1, 'Leather Handbag', '120.99'),(2, 'Canvas Backpack', '49.99'),(3, 'Tote Bag', '25.50'),(4, 'Duffel Bag', '85.00'),(5, 'Small Satchel', '60.00'),(6, 'Luggage Set', '299.99'),(7, 'Clutch Purse', '40.00'),(8, 'Messenger Bag', '70.00'),(9, 'Briefcase', '150.00'),(10, 'Crossbody Bag', '55.00'),(11, 'Diaper Bag', '80.00'),(12, 'Travel Bag', '100.00'),(13, 'Sporty Gym Bag', '35.00'),(14, 'Laptop Bag', '75.00'),(15, 'Weekender Bag', '95.00'),(16, 'Bucket Bag', '110.00'),(17, 'Hobo Bag', '65.00'),(18, 'Backpack Purse', '50.00'),(19, 'Weekend Tote', '45.00'),(20, 'Shopping Bag', '15.00')";

		String updateQuery1 = "UPDATE bag_table SET bag_price = '120.99' WHERE id = 1";
		String updateQuery2 = "UPDATE bag_table SET bag_price = '49.99' WHERE id = 2";
		String updateQuery3 = "UPDATE bag_table SET bag_price = '25.50' WHERE id = 3";
		String updateQuery4 = "UPDATE bag_table SET bag_price = '85.00' WHERE id = 4";
		String updateQuery5 = "UPDATE bag_table SET bag_price = '60.00' WHERE id = 5";
		String updateQuery6 = "UPDATE bag_table SET bag_price = '299.99' WHERE id = 6";
		String updateQuery7 = "UPDATE bag_table SET bag_price = '40.00' WHERE id = 7";
		String updateQuery8 = "UPDATE bag_table SET bag_price = '70.00' WHERE id = 8";
		String updateQuery9 = "UPDATE bag_table SET bag_price = '150.00' WHERE id = 9";
		String updateQuery10 = "UPDATE bag_table SET bag_price = '55.00' WHERE id = 10";

		String deleteQuery1 = "delete from bag_table where id=11";
		String deleteQuery2 = "delete from bag_table where id=12";
		String deleteQuery3 = "delete from bag_table where id=13";
		String deleteQuery4 = "delete from bag_table where id=14";
		String deleteQuery5 = "delete from bag_table where id=15";
		String deleteQuery6 = "delete from bag_table where id=16";
		String deleteQuery7 = "delete from bag_table where id=17";
		String deleteQuery8 = "delete from bag_table where id=18";
		String deleteQuery9 = "delete from bag_table where id=19";
		String deleteQuery10 = "delete from bag_table where id=20";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, userName, password);
			Statement statement = connection.createStatement();
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
