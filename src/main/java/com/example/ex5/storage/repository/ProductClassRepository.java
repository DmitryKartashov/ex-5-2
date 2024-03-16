package com.example.ex5.storage.repository;

import com.example.ex5.storage.model.dict.ProductClassEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductClassRepository extends JpaRepository<ProductClassEntity,Long> {
}
