package com.telusmikolaj.pharmacy.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class MedicineDto {

    private Long id;
    private String name;
    private LocalDate expirationDate;
    private int quantity;
}
