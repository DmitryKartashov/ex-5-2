package com.example.ex5.storage.repository;

import com.example.ex5.storage.model.AgreementEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgreementRepository extends JpaRepository<AgreementEntity,Long>  {
}
