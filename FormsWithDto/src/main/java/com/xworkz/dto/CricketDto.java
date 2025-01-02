package com.xworkz.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class CricketDto {
    private int id;
    private String tournamentName;
    private String organizerName;
    private String location;
    private String startDate;
    private String endDate;
    private int totalTeams;
    private long contactNumber;
    private String email;

}


