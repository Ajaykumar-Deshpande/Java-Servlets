package com.xworkz.dto;

import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MilkDto {
    private  int id;
    private String brand;
    private String type;
    private int quantity;
    private double total;
    }



