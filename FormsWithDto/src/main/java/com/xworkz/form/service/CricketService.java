package com.xworkz.form.service;

import com.xworkz.dto.CricketDto;

import java.util.List;

public interface CricketService {
    boolean save(CricketDto cricketDto);
    List<CricketDto> getAll();
}
