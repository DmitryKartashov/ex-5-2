package com.example.ex5.storage.model.dict;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
@Table(name = "tpp_ref_product_class")
public class ProductClassEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "val", length = 100, nullable = false, unique = true)
    private String val;

    @Column(name = "gbl_code", length = 50)
    private String gblCode;

    @Column(name = "gbl_name", length = 100)
    private String gblName;

    @Column(name = "product_row_code", length = 50)
    private String productRowCode;

    @Column(name = "product_row_name", length = 100)
    private String productRowName;

    @Column(name = "subclass_code", length = 50)
    private String subclassCode;

    @Column(name = "subclass_name", length = 100)
    private String subclassName;
}
