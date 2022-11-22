package com.telusmikolaj.pharmacy.repository;

import com.telusmikolaj.pharmacy.model.Medicine;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Table;
import java.util.List;

@Repository
@Table(name = "medicine")
public class MedicineRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Medicine> getAll() {
        return this.entityManager.createQuery("SELECT m FROM  Medicine m", Medicine.class).getResultList();
    }
}
