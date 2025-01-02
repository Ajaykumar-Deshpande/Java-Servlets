package com.xworkz.dto;

import lombok.*;


@NoArgsConstructor
@Getter
@Setter
@ToString
public class MuseumDto {

    private int id;
    private String coustmer_name;
    private int numOfAdults;
    private int numOfChildren;
    private long mobileNumber;
    private String email;

    public MuseumDto(int id, String coustmer_name, int numOfAdults, int numOfChildren, long mobileNumber, String email) {
        this.id = id;
        this.coustmer_name = coustmer_name;
        this.numOfAdults = numOfAdults;
        this.numOfChildren = numOfChildren;
        this.mobileNumber = mobileNumber;
        this.email = email;
    }

    public MuseumDto(String customerName, int numOfAdults, int numOfChildren, long mobileNumber, String email) {
    }
}
