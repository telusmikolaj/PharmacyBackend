package com.telusmikolaj.pharmacy.service;

import com.telusmikolaj.pharmacy.model.dto.MedicineDto;
import com.telusmikolaj.pharmacy.model.mapper.MedicineMapper;
import com.telusmikolaj.pharmacy.repository.MedicineRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MedicineService {

    private final MedicineRepository medicineRepository;

    private final MedicineMapper mapper;

    public MedicineService(MedicineRepository medicineRepository, MedicineMapper mapper) {
        this.medicineRepository = medicineRepository;
        this.mapper = mapper;
    }

    public List<MedicineDto> getAll() {
        return this.medicineRepository.getAll()
                .stream()
                .map(this.mapper::mapMedicineToDto).
                collect(Collectors.toList());
    }
}
