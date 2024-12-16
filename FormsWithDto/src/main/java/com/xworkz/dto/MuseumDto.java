package com.xworkz.dto;

import lombok.*;


@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class MuseumDto {
    private String name;
    private int numOfAdults;
    private int numOfChildren;
    private long mobileNumber;
    private String email;


    public MuseumDto(String customerName, int numOfAdults, int numOfChildren, long mobileNumber, String email) {
        this.name = name;
        this.numOfAdults = numOfAdults;
        this.numOfChildren = numOfChildren;
        this.mobileNumber = mobileNumber;
        this.email = email;

    }
}
