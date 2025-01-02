package com.xworkz.repository;

import com.xworkz.dto.MilkDto;
import com.xworkz.dto.SweetDto;

import java.util.List;

public interface SweetRepo {
    boolean save(SweetDto sweetDto) throws ClassNotFoundException;
    List<SweetDto> getAll();

}
