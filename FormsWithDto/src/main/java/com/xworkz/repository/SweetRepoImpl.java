package com.xworkz.repository;


import com.xworkz.dto.SweetDto;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SweetRepoImpl implements SweetRepo {
    public boolean save(SweetDto sweetDto) throws ClassNotFoundException {
        Connection connection = null;
        Statement statement = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/sweet";
            String username = "root";
            String password = "Ajay@787898";
            connection = DriverManager.getConnection(url, username, password);
            System.out.println(" jdbc connected succesfull");
            String insert = "INSERT INTO sweet_info(ShopName,SweetName,Special,quantity) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insert);
            preparedStatement.setString(1, sweetDto.getShopName());
            preparedStatement.setString(2, sweetDto.getSweetName());
            preparedStatement.setString(3, sweetDto.getSpecial());
            preparedStatement.setInt(4, sweetDto.getQuantity());
            int row = preparedStatement.executeUpdate();
            System.out.println("no of rows inserted :" + row);
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public List<SweetDto> getAll() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/sweet";
            String username = "root";
            String password = "Ajay@787898";
            connection = DriverManager.getConnection(url, username, password);
            System.out.println(" jdbc connected succesfull");
            Statement statement = connection.createStatement();
            String insert = "select * from sweet_info";
            ResultSet resultSet = statement.executeQuery(insert);
            List<SweetDto> list = new ArrayList<>();

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String ShopName = resultSet.getString(2);
                String SweetName = resultSet.getString(3);
                String Special = resultSet.getString(4);
                int quantity = resultSet.getInt(5);
                SweetDto sweetDto = new SweetDto (ShopName, SweetName, Special, quantity);
                list.add(sweetDto);

            }
            return list;

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}


