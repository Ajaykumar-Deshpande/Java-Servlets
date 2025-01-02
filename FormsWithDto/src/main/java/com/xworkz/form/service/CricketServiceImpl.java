package com.xworkz.form.service;

import com.xworkz.dto.CricketDto;
import com.xworkz.repository.CricketRepo;
import com.xworkz.repository.CricketRepoImpl;

import java.util.Collections;
import java.util.List;

public class CricketServiceImpl implements CricketService {
    @Override
    public boolean save(CricketDto cricketDto) {
       CricketRepo cricketRepo= new CricketRepoImpl();
       cricketRepo.save(cricketDto);
        return true;
    }

    @Override
    public List<CricketDto> getAll() {
        CricketRepo cricketRepo=new CricketRepoImpl();

        List<CricketDto>list=cricketRepo.getAll();
        return list;

    }
}
