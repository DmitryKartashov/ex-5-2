package com.example.ex5.storage.repository;

import com.example.ex5.storage.model.dict.ProductRegisterTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRegisterTypeRepository extends JpaRepository<ProductRegisterTypeEntity,Long> {
}
