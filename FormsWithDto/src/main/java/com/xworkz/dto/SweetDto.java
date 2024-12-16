package com.xworkz.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class SweetDto {
    private String ShopName;
    private  String SweetName;
    private String Special;
    private int quantity;
}
