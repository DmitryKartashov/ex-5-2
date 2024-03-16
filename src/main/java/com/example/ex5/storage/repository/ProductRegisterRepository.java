package com.example.ex5.storage.repository;

import com.example.ex5.storage.model.ProductRegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRegisterRepository extends JpaRepository<ProductRegisterEntity,Long> {
}
