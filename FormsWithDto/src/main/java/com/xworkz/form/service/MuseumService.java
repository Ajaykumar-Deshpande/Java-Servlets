package com.xworkz.form.service;


import com.xworkz.dto.MuseumDto;

import java.util.List;

public interface MuseumService {
    boolean save(MuseumDto museumDto);
    List<MuseumDto> getAll();

}
