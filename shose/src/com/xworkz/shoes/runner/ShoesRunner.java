package com.xworkz.shoes.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ShoesRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/shoes";
		String userName = "root";
		String password = "Ajay@787898";
		String insertQuery ="INSERT INTO shoes_table VALUES (1,'Running Shoes', '49.99'),(2,'Sneakers', '59.99'),(3,'Formal Shoes', '89.99'),(4,'Boots', '119.99'),(5,'Flip Flops', '15.99'),(6,'Sandals', '25.49'),(7,'Loafers', '69.99'),(8,'High Heels', '79.99'),(9,'Wedges', '69.49'),(10,'Work Shoes', '89.00'),(11,'Casual Shoes', '39.99'),(12,'Sports Shoes', '69.99'),(13,'Dress Shoes', '95.99'),(14,'Clogs', '29.99'),(15,'Orthopedic Shoes', '129.99'),(16,'Platform Shoes', '79.49'),(17,'Ankle Boots', '99.99'),(18,'Slippers', '18.99'),(19,'Chelsea Boots', '109.00'),(20,'Espadrilles', '49.99')";
		String updateQuery1 = "UPDATE shoes_table SET shoes_price = '20.00' WHERE id = 1";
		String updateQuery2 = "UPDATE shoes_table SET shoes_price = '26.00' WHERE id = 2";
		String updateQuery3 = "UPDATE shoes_table SET shoes_price = '15.50' WHERE id = 3";
		String updateQuery4 = "UPDATE shoes_table SET shoes_price = '30.00' WHERE id = 4";
		String updateQuery5 = "UPDATE shoes_table SET shoes_price = '13.50' WHERE id = 5";
		String updateQuery6 = "UPDATE shoes_table SET shoes_price = '10.50' WHERE id = 6";
		String updateQuery7 = "UPDATE shoes_table SET shoes_price = '40.00' WHERE id = 7";
		String updateQuery8 = "UPDATE shoes_table SET shoes_price = '50.50' WHERE id = 8";
		String updateQuery9 = "UPDATE shoes_table SET shoes_price = '19.50' WHERE id = 9";
		String updateQuery10 = "UPDATE shoes_table SET shoes_price = '16.00' WHERE id = 10";
		
		String deleteQuery1 = "delete from shoes_table where id=11";
		String deleteQuery2 = "delete from shoes_table where id=12";
		String deleteQuery3 = "delete from shoes_table where id=13";
		String deleteQuery4 = "delete from shoes_table where id=14";
		String deleteQuery5 = "delete from shoes_table where id=15";
		String deleteQuery6 = "delete from shoes_table where id=16";
		String deleteQuery7 = "delete from shoes_table where id=17";
		String deleteQuery8 = "delete from shoes_table where id=18";
		String deleteQuery9 = "delete from shoes_table where id=19";
		String deleteQuery10 ="delete from shoes_table where id=20";
		
		Connection connection=null;

		try {
			connection = DriverManager.getConnection(url, userName, password); 
		Statement statement=connection.createStatement();
			int value = statement.executeUpdate(insertQuery);
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



	