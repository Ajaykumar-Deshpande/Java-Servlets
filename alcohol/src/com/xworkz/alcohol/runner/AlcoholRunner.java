package com.xworkz.alcohol.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AlcoholRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/alcohol";
		String userName = "root";
		String password = "Ajay@787898";
		String insertQuery = "INSERT INTO alcohol_table  VALUES(1, 'Amrut Fusion', '70.00'),(2, 'Sula Vineyards Cabernet Sauvignon', '45.00'),(3, 'Paul John Brilliance', '65.00'),(4, 'Rampur Indian Single Malt', '85.00'),(5, 'Glenfiddich 12 Year Old (Indian import)', '50.00'),(6, 'McDowell’s No. 1 Reserve', '15.00'),(7, 'Royal Stag', '12.00'),(8, 'Blenders Pride', '20.00'),(9, 'Johnnie Walker Red Label (Indian import)', '40.00'),(10, 'Signature by McDowell’s', '22.00'),(11, 'Radico 8 PM', '25.00'),(12, 'Antiquity Blue', '35.00'),(13, 'Officer’s Choice Blue', '18.00'),(14, 'Imperial Blue', '17.00'),(15, 'McDowell’s No. 1 Platinum', '30.00'),(16, 'Sula Vineyards Sauvignon Blanc', '35.00'),(17, 'Bira 91', '5.00'),(18, 'Kingfisher Premium Lager', '6.00'),(19, 'Simla Premium Whiskey', '15.00'),(20, 'Tanqueray (Indian import)', '50.00')";

		String updateQuery1 = "UPDATE alcohol_table SET alcohol_pricel = '70.00' WHERE id = 1";
		String updateQuery2 = "UPDATE alcohol_table SET alcohol_pricel = '45.00' WHERE id = 2";
		String updateQuery3 = "UPDATE alcohol_table SET alcohol_pricel= '65.00' WHERE id = 3";
		String updateQuery4 = "UPDATE alcohol_table SET alcohol_pricel = '85.00' WHERE id = 4";
		String updateQuery5 = "UPDATE alcohol_table SET alcohol_pricel = '50.00' WHERE id = 5";
		String updateQuery6 = "UPDATE alcohol_table SET alcohol_pricel = '15.00' WHERE id = 6";
		String updateQuery7 = "UPDATE alcohol_table SET alcohol_pricel = '12.00' WHERE id = 7";
		String updateQuery8 = "UPDATE alcohol_table SET alcohol_pricel = '20.00' WHERE id = 8";
		String updateQuery9 = "UPDATE alcohol_table SET alcohol_pricel = '40.00' WHERE id = 9";
		String updateQuery10 = "UPDATE alcohol_table SET alcohol_pricel = '22.00' WHERE id = 10";

		String deleteQuery1 = "delete from alcohol_table where id=11";
		String deleteQuery2 = "delete from alcohol_table where id=12";
		String deleteQuery3 = "delete from alcohol_table where id=13";
		String deleteQuery4 = "delete from alcohol_table where id=14";
		String deleteQuery5 = "delete from alcohol_table where id=15";
		String deleteQuery6 = "delete from alcohol_table where id=16";
		String deleteQuery7 = "delete from alcohol_table where id=17";
		String deleteQuery8 = "delete from alcohol_table where id=18";
		String deleteQuery9 = "delete from alcohol_table where id=19";
		String deleteQuery10 = "delete from alcohol_table where id=20";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, userName, password);
			Statement statement = connection.createStatement();
			int value = statement.executeUpdate(deleteQuery9);
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
