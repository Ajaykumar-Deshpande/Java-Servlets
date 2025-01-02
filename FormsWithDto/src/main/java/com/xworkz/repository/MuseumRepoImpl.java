package com.xworkz.repository;

import com.xworkz.dto.CricketDto;
import com.xworkz.dto.MuseumDto;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MuseumRepoImpl implements MuseumRepo {
    @Override
    public boolean save(MuseumDto museumDto) throws SQLException {
        Connection connection = null;
        Statement statement = null;
        System.out.println(museumDto.toString());
        System.out.println("repo museum");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/Museum";
            String username = "root";
            String password = "Ajay@787898";
            connection = DriverManager.getConnection(url, username, password);
            System.out.println(" jdbc connected succesfull");
            String insert = "INSERT INTO museum_info (coustmer_name, numOfAdults, numOfChildren, mobileNumber, email) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insert);
//            preparedStatement.setInt(1, museumDto.getId());
            preparedStatement.setString(1, museumDto.getCoustmer_name());
            preparedStatement.setInt(2, museumDto.getNumOfAdults());
            preparedStatement.setInt(3, museumDto.getNumOfChildren());
            preparedStatement.setLong(4, museumDto.getMobileNumber());
            preparedStatement.setString(5, museumDto.getEmail());
            // statement = connection.createStatement();
            int row = preparedStatement.executeUpdate();
            System.out.println("no of rows inserted :" + row);
            return true;


        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            return false;


        } finally {
            if (connection != null) {
                connection.close();
            }

        }
    }

    @Override
    public List<MuseumDto> getAll() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/museum";
            String username = "root";
            String password = "Ajay@787898";
            connection = DriverManager.getConnection(url, username, password);
            System.out.println(" jdbc connected succesfull");
            Statement statement = connection.createStatement();
            String insert = "select * from museum_info";
            ResultSet resultSet = statement.executeQuery(insert);
            List<MuseumDto> list = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String coustmer_name = resultSet.getString(2);
                int numOfAdults = resultSet.getInt(3);
                int numOfChildren = resultSet.getInt(4);
                long mobileNumber = resultSet.getLong(5);
                String email = resultSet.getString(6);
                MuseumDto museumDto = new MuseumDto(id, coustmer_name, numOfAdults, numOfChildren, mobileNumber, email);
                list.add(museumDto);


            }
            return list;


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}


