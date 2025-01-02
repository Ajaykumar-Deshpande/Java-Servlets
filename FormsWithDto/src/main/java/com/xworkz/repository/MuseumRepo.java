package com.xworkz.repository;

import com.xworkz.dto.MilkDto;
import com.xworkz.dto.MuseumDto;

import java.sql.SQLException;
import java.util.List;

public interface MuseumRepo {
    boolean save(MuseumDto museumDto) throws SQLException;
    List<MuseumDto> getAll();


}
