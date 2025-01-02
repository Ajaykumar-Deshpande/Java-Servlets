package com.xworkz.form.service;

import com.xworkz.dto.SweetDto;
import com.xworkz.repository.SweetRepo;
import com.xworkz.repository.SweetRepoImpl;

import java.util.Collections;
import java.util.List;

public class SweetServiceImpl implements SweetService {


    @Override
    public boolean save(SweetDto sweetDto) {
        SweetRepo sweetRepo = new SweetRepoImpl();
        try {
            System.out.println("service : "+sweetDto);
            sweetRepo.save(sweetDto);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

    @Override
    public List<SweetDto> getAll() {
        SweetRepo sweetRepo=new SweetRepoImpl();
        List<SweetDto>list=sweetRepo.getAll();
        return list;
    }

}