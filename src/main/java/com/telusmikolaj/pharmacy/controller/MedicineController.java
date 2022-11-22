package com.telusmikolaj.pharmacy.controller;

import com.telusmikolaj.pharmacy.model.dto.MedicineDto;
import com.telusmikolaj.pharmacy.service.MedicineService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pharmacy")
public class MedicineController {

    private final MedicineService medicineService;

    public MedicineController(MedicineService medicineService) {
        this.medicineService = medicineService;
    }

    @GetMapping
    public List<MedicineDto> getAll() {
        return this.medicineService.getAll();
    }

}
