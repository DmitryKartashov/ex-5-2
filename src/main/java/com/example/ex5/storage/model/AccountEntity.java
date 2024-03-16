package com.example.ex5.storage.model;

import com.example.ex5.storage.model.dict.AccountPoolEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "account")
public class AccountEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "account_number")
    private String number;

    @ManyToOne
    @JoinColumn(name = "account_pool_id")
    private AccountPoolEntity accountPool;
}
