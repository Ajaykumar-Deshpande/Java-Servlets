package com.xworkz.form.service;

import com.xworkz.dto.MilkDto;
import com.xworkz.dto.MuseumDto;
import com.xworkz.repository.MilkRepo;
import com.xworkz.repository.MilkRepoImpl;
import com.xworkz.repository.MuseumRepo;
import com.xworkz.repository.MuseumRepoImpl;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class MuseumServiceImpl implements MuseumService{
    @Override
    public boolean save(MuseumDto museumDto) {
        MuseumRepo museumRepo=new MuseumRepoImpl();
        try {
            museumRepo.save(museumDto);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return true;

    }

    @Override
    public List<MuseumDto> getAll() {
        MuseumRepo museumRepo=new MuseumRepoImpl();
        List<MuseumDto> list=museumRepo.getAll();
        return  list;
    }
}
