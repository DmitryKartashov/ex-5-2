package com.example.ex5.storage.model;

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

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "product")
public class ProductEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "product_code_id")
    private Long productCodeId;

    @Column(name = "client_id")
    private Long clientId;

    @Column(name = "number", length = 50)
    private String number;

    @Column(name = "priority")
    private Long priority;

    @Column(name = "date_of_conclusion")
    private LocalDateTime dateOfConclusion;

    @Column(name = "start_date_time")
    private LocalDateTime startDateTime;

    @Column(name = "end_date_time")
    private LocalDateTime endDateTime;

    @Column(name = "days")
    private Long days;

    @Column(name = "penalty_rate")
    private BigDecimal penaltyRate;

    @Column(name = "nso")
    private BigDecimal nso;

    @Column(name = "threshold_amount")
    private BigDecimal thresholdAmount;

    @Column(name = "requisite_type", length = 50)
    private String requisiteType;

    @Column(name = "interest_rate_type", length = 50)
    private String interestRateType;

    @Column(name = "tax_rate")
    private BigDecimal taxRate;

    @Column(name = "reasone_close", length = 100)
    private String reasonClose;

    @Column(name = "state", length = 50)
    private String state;
}
