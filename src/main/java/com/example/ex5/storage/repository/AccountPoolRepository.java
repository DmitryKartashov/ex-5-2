package com.example.ex5.storage.repository;

import com.example.ex5.storage.model.dict.AccountPoolEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountPoolRepository extends JpaRepository<AccountPoolEntity,Long>  {
}
