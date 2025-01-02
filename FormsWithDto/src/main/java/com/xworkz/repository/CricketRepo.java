package com.xworkz.repository;

import com.xworkz.dto.CricketDto;

import java.util.List;

public interface CricketRepo {
    boolean save(CricketDto cricketDto);
    List<CricketDto> getAll();

}
