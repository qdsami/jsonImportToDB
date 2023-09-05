package com.example.importFromExcel.service;

import com.example.importFromExcel.entity.EmplayeEntity;

import java.util.List;
import java.util.Optional;

public interface EmplayeService {
    List<EmplayeEntity> findAllEmployee();
    Optional<EmplayeEntity> findById(Long id);
    EmplayeEntity saveEmployee(EmplayeEntity emplayeEntity);
    EmplayeEntity updateEmployees(EmplayeEntity emplayeEntity);
    void deleteEmployee(Long id);
}
