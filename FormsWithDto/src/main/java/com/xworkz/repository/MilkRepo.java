package com.xworkz.repository;

import com.xworkz.dto.MilkDto;

import java.util.List;

public interface MilkRepo {
    boolean save(MilkDto milkDto);
    List<MilkDto> getAll();


}
