package com.xworkz.form.service;

import com.xworkz.dto.SweetDto;

import java.util.List;

public interface SweetService {
    boolean save(SweetDto sweetDto);
    List<SweetDto> getAll();

}
