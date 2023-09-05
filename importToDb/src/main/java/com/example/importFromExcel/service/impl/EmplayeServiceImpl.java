package com.example.importFromExcel.service.impl;

import com.example.importFromExcel.entity.EmplayeEntity;
import com.example.importFromExcel.repository.EmplayeRepository;
import com.example.importFromExcel.service.EmplayeService;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class EmplayeServiceImpl implements EmplayeService {

    private final EmplayeRepository emplayeRepository;

    public EmplayeServiceImpl(EmplayeRepository emplayeRepository) {
        this.emplayeRepository = emplayeRepository;
    }

    @Override
    public List<EmplayeEntity> findAllEmployee() {
        return emplayeRepository.findAll();
    }

    @Override
    public Optional<EmplayeEntity> findById(Long id) {
        return emplayeRepository.findById(id);
    }

    @Override
    public EmplayeEntity saveEmployee(EmplayeEntity emplayeEntity) {
        return emplayeRepository.save(emplayeEntity);
    }


//    public EmplayeEntity saveEmployee(MultipartFile file) throws IOException, InvalidFormatException {
//        Workbook workbook = WorkbookFactory.create(file.getInputStream());
//        Sheet sheet = workbook.getSheetAt(0);
//
//        Iterator<Row> rowIterator = sheet.iterator();
//        while (rowIterator.hasNext()) {
//            Row row = rowIterator.next();
//
//            EmplayeEntity emplayeEntity = new EmplayeEntity();
//            // Заполнение полей объекта EmplayeEntity из ячеек файла
//            emplayeEntity.setCode((int) row.getCell(0).getNumericCellValue());
//            emplayeEntity.setNameEng(row.getCell(1).getStringCellValue());
//            emplayeEntity.setNameRus(row.getCell(2).getStringCellValue());
//            emplayeEntity.setCharCode(row.getCell(3).getStringCellValue());
//
//            emplayeRepository.save(emplayeEntity);
//        }
//
//        workbook.close();
//
//        return new EmplayeEntity(); // Возвращает последний сохраненный объект EmplayeEntity или список сохраненных объектов, в зависимости от ваших потребностей
//    }


    @Override
    public EmplayeEntity updateEmployees(EmplayeEntity emplayeEntity) {
        return emplayeRepository.save(emplayeEntity);
    }

    @Override
    public void deleteEmployee(Long id) {
        emplayeRepository.deleteById(id);
    }
}
