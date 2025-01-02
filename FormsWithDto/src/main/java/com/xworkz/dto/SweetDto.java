package com.xworkz.dto;

import lombok.*;

@NoArgsConstructor

@ToString
@Getter
@Setter
public class SweetDto {
    private int id;
    private String ShopName;
    private  String SweetName;
    private String Special;
    private int quantity;
    public SweetDto(String ShopName, String SweetName, String Special, int quantity){
        this.ShopName=ShopName;
        this.SweetName=SweetName;
        this.Special=Special;
        this.quantity=quantity;
    }
}
