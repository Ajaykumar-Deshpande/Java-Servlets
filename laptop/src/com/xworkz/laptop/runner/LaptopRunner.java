package com.xworkz.laptop.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LaptopRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/laptop";
		String userName = "root";
		String password = "Ajay@787898";
		String insertQuery = "INSERT INTO laptop_table VALUES(1, 'Dell XPS 13', '999.99'),(2, 'MacBook Pro 13', '1299.99'),(3, 'HP Spectre x360', '1099.00'),(4, 'Lenovo ThinkPad X1 Carbon', '1399.00'),(5, 'Asus ROG Zephyrus', '1599.99'),(6, 'Microsoft Surface Laptop 4', '1199.00'),(7, 'Acer Predator Helios 300', '1399.99'),(8, 'Razer Blade 15', '1899.99'),(9, 'HP Envy 13', '899.99'),(10, 'MacBook Air M1', '999.00'),(11, 'Samsung Galaxy Book Pro 360', '1049.99'),(12, 'LG Gram 17', '1699.00'),(13, 'Dell Inspiron 15', '649.99'),(14, 'Alienware m15 R6', '1999.00'),(15, 'MSI GE66 Raider', '1799.00'),(16, 'Apple MacBook Pro 16', '2399.99'),(17, 'Lenovo Legion 5 Pro', '1599.00'),(18, 'Acer Swift 3', '699.00'),(19, 'HP Pavilion 14', '749.00'),(20, 'Asus ZenBook Flip 14', '849.00')";

		String updateQuery1 = "UPDATE laptop_table SET laptop_price = '999.99' WHERE id = 1";
		String updateQuery2 = "UPDATE laptop_table SET laptop_price = '1299.99' WHERE id = 2";
		String updateQuery3 = "UPDATE laptop_table SET laptop_price = '1099.00' WHERE id = 3";
		String updateQuery4 = "UPDATE laptop_table SET laptop_price = '1399.00' WHERE id = 4";
		String updateQuery5 = "UPDATE laptop_table SET laptop_price = '1599.99' WHERE id = 5";
		String updateQuery6 = "UPDATE laptop_table SET laptop_price = '1199.00' WHERE id = 6";
		String updateQuery7 = "UPDATE laptop_table SET laptop_price = '1399.99' WHERE id = 7";
		String updateQuery8 = "UPDATE laptop_table SET laptop_price = '1899.99' WHERE id = 8";
		String updateQuery9 = "UPDATE laptop_table SET laptop_price = '899.99' WHERE id = 9";
		String updateQuery10 = "UPDATE laptop_table SET laptop_price = '999.00' WHERE id = 10";

		String deleteQuery1 = "delete from laptop_table where id=11";
		String deleteQuery2 = "delete from laptop_table where id=12";
		String deleteQuery3 = "delete from laptop_table where id=13";
		String deleteQuery4 = "delete from laptop_table where id=14";
		String deleteQuery5 = "delete from laptop_table where id=15";
		String deleteQuery6 = "delete from laptop_table where id=16";
		String deleteQuery7 = "delete from laptop_table where id=17";
		String deleteQuery8 = "delete from laptop_table where id=18";
		String deleteQuery9 = "delete from laptop_table where id=19";
		String deleteQuery10 = "delete from laptop_table where id=20";

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
