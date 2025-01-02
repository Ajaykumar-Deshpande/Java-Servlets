package com.xworkz.repository;

import com.xworkz.dto.CricketDto;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CricketRepoImpl implements CricketRepo{
    @Override
    public boolean save(CricketDto cricketDto) {
        System.out.println("repo"+cricketDto);
        Connection connection=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/cricket";
            String username = "root";
            String password = "Ajay@787898";
            connection = DriverManager.getConnection(url, username, password);
            System.out.println(" jdbc connected succesfull");
            String insert = "insert into cricket values(0,'"+cricketDto.getTournamentName()+"','"+cricketDto.getOrganizerName()+"','"+cricketDto.getLocation()+"','"+cricketDto.getStartDate()+"','"+cricketDto.getEndDate()+"','"+cricketDto.getTotalTeams()+"','"+cricketDto.getContactNumber()+"','"+cricketDto.getEmail()+"')";
            Statement statement=connection.createStatement();
            int row = statement.executeUpdate(insert);
            System.out.println("no of rows inserted :" + row);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return  true;
    }

    @SneakyThrows
    @Override
    public List<CricketDto> getAll() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/cricket";
            String username = "root";
            String password = "Ajay@787898";
            connection = DriverManager.getConnection(url, username, password);
            System.out.println(" jdbc connected succesfull");
            Statement statement = connection.createStatement();
            String insert = "select * from cricket";
            ResultSet resultSet = statement.executeQuery(insert);
            List<CricketDto> list = new ArrayList<>();

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String tournamentName = resultSet.getString(2);
                String organizerName = resultSet.getString(3);
                String location = resultSet.getString(4);
                String startDate = resultSet.getString(5);
                String endDate = resultSet.getString(6);
                int totalTeams = resultSet.getInt(7);
                long contactNumber = resultSet.getLong(8);
                String email = resultSet.getString(9);
                CricketDto cricketDto = new CricketDto(id, tournamentName, organizerName, location, startDate, endDate, totalTeams, contactNumber, email);

                list.add(cricketDto);

            }
            return list;
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

