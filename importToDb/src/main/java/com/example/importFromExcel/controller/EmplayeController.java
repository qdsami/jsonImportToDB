package com.example.importFromExcel.controller;

import com.example.importFromExcel.entity.EmplayeEntity;
import com.example.importFromExcel.repository.EmplayeRepository;
import com.example.importFromExcel.service.EmplayeService;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmplayeController {
    private final EmplayeService emplayeService;

    public EmplayeController(EmplayeService emplayeService) {
        this.emplayeService = emplayeService;
    }

    @GetMapping
    public List<EmplayeEntity> findAllEmployee(){
        return emplayeService.findAllEmployee();
    }

    @GetMapping("/{id}")
    public Optional<EmplayeEntity> findEmployeeById(@PathVariable("id") Long id){
        return emplayeService.findById(id);
    }

    @PostMapping(consumes = {"application/xml","application/json"})
    public EmplayeEntity saveEmployee(@RequestBody EmplayeEntity emplayeEntity){
        return emplayeService.saveEmployee(emplayeEntity);
   }
//@PostMapping(value = "/employee", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
//public EmplayeEntity saveEmployee(@RequestPart("file") MultipartFile file, @RequestPart("data") EmplayeEntity emplayeEntity) {
//    try {
//        Workbook workbook = WorkbookFactory.create(file.getInputStream());
//        Sheet sheet = workbook.getSheetAt(0);
//
//        Iterator<Row> rowIterator = sheet.iterator();
//        while (rowIterator.hasNext()) {
//            Row row = rowIterator.next();
//
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
//    } catch (IOException | InvalidFormatException e) {
//        // Обработка ошибки
//    }
//
//    return emplayeEntity;
//}



    @PutMapping
    public EmplayeEntity updateEmployee(@RequestBody EmplayeEntity emplayeEntity){
        return emplayeService.updateEmployees(emplayeEntity);
    }


    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable("id") Long id){
        emplayeService.deleteEmployee(id);
    }
}
