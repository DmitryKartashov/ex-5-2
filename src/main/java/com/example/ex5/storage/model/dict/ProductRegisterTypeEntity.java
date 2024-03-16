package com.example.ex5.storage.model.dict;

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
@Table(name = "tpp_ref_product_register_type")
public class ProductRegisterTypeEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "val", length = 100, nullable = false, unique = true)
    private String val;

    @Column(name = "register_type_name", length = 100, nullable = false)
    private String registerTypeName;

    @Column(name = "product_class_code", length = 100, nullable = false)
    private String productClassCode;
}
