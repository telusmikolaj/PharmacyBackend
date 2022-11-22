package com.telusmikolaj.pharmacy.model.mapper;

import com.telusmikolaj.pharmacy.model.Medicine;
import com.telusmikolaj.pharmacy.model.dto.MedicineDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MedicineMapper {

    MedicineDto mapMedicineToDto(Medicine medicine);
}
