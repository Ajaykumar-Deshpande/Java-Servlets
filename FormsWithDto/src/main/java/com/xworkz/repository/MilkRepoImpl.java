package com.xworkz.repository;

import com.xworkz.dto.MilkDto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MilkRepoImpl implements MilkRepo {
    @Override
    public boolean save(MilkDto milkDto) {
        System.out.println("repo"+milkDto);
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("connection successful");
            String url = "jdbc:mysql://localhost:3306/milk";
            String username = "root";
            String password = "Ajay@787898";
            connection = DriverManager.getConnection(url, username, password);
            System.out.println(" jdbc connected succesfull");
            String insert = "insert into milk_table values(0,'" + milkDto.getBrand() + "','" + milkDto.getType() + "','" + milkDto.getQuantity() + "','" + milkDto.getTotal() + "')";
            Statement statement = connection.createStatement();
            int row = statement.executeUpdate(insert);
            System.out.println("no of rows inserted :" + row);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }
        return true;
    }

    @Override
    public List<MilkDto> getAll() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/milk";
            String username = "root";
            String password = "Ajay@787898";
            connection = DriverManager.getConnection(url, username, password);
            System.out.println(" jdbc connected succesfull");
            Statement statement = connection.createStatement();
            String insert = "select * from milk_table";
            ResultSet resultSet = statement.executeQuery(insert);
            List<MilkDto> list = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String brand = resultSet.getString(2);
                String type = resultSet.getString(3);
                int quantity = resultSet.getInt(4);
                double total = resultSet.getDouble(5);
                MilkDto milkDto = new MilkDto(id, brand, type, quantity, total);
                list.add(milkDto);
            }


        return list;
    } catch (ClassNotFoundException | SQLException e) {
        throw new RuntimeException(e);
    }
}
}



