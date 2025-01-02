package com.xworkz.form.service;

import com.xworkz.dto.MilkDto;

import java.util.List;

public interface MilkService {
    boolean save(MilkDto milkDto);
    List<MilkDto> getALL();
}
