package com.example.ex5.controller;

import com.example.ex5.api.ProductReq;
import com.example.ex5.api.ProductResp;
import com.example.ex5.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Validated
@RestController
@RequestMapping(value = "corporate-settlement-instance/", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/create")
    public ProductResp addProduct(@RequestBody @Valid ProductReq addProduct) {
        if (addProduct.getInstanceId() == null) {
            String productNumber = addProduct.getContractNumber();
            String registerType = addProduct.getRegisterType();
            List<String> agreementNumber = productService.getNumbers(addProduct);

            if (productService.productByNumber(productNumber).isPresent()) {
                throw new DuplicateProductException("Договор с номером " + addProduct.getContractNumber() + " уже существует");
            }

            Optional<String> checkRegisterType = productService.checkRegisterType(registerType);

            if (checkRegisterType.isPresent()) {
                throw new RegisterNotFountException(checkRegisterType.get());
            }

            Optional<List<String>> errorMsg = productService.findDuplicateAgreements(agreementNumber);
            if (errorMsg.isPresent()) {
                throw new DuplicateAgreementException(errorMsg.get());
            }


            return productService.addProduct(addProduct);
        } else {
            if (productService.findProduct(addProduct.getInstanceId()).isPresent()) {
                List<String> agreementNumber = productService.getNumbers(addProduct);

                Optional<List<String>> errorMsg = productService.findDuplicateAgreements(agreementNumber);
                if (errorMsg.isPresent()) {
                    throw new DuplicateAgreementException(errorMsg.get());
                }
                return productService.addAgreements(addProduct);
            } else {
                throw new ProductNotFoundException("Для регистра не найден продукт с ID " + addProduct.getInstanceId());
            }
        }
    }
}
