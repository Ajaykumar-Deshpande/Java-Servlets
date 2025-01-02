package com.xworkz.form.service;

import com.xworkz.dto.MilkDto;
import com.xworkz.repository.MilkRepo;
import com.xworkz.repository.MilkRepoImpl;

import java.util.List;

public class MilkServiceImpl implements MilkService{
    @Override
    public boolean save(MilkDto milkDto) {
        MilkRepo milkRepo=new MilkRepoImpl();
        milkRepo.save(milkDto);
        return true;
    }

    @Override
    public List<MilkDto> getALL() {
        MilkRepo milkRepo=new MilkRepoImpl();

        List<MilkDto> list=milkRepo.getAll();
        return list;
    }
}
