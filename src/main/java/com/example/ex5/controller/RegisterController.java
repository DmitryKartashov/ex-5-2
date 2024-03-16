package com.example.ex5.controller;

import com.example.ex5.api.RegisterReq;
import com.example.ex5.api.RegisterResp;
import com.example.ex5.service.ProductService;
import com.example.ex5.service.RegisterService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Validated
@RestController
@RequestMapping(value = "corporate-settlement-account/", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @PostMapping("/create")
    public RegisterResp addRegister(@RequestBody @Valid RegisterReq addRegister) {
//        String registerType = addRegister.getRegistryTypeCode();
//        Optional<Product> product = registerService.findProduct(addRegister.getInstanceId());
//
//        if (product.isPresent()) {
//            Optional<String> registerTypeDuplicate = registerService.checkDuplicateRegister(addRegister.getInstanceId(), addRegister.getRegistryTypeCode());
//            if (registerTypeDuplicate.isPresent()) {
//                throw new DuplicateRegisterException("У продукта c ID " + addRegister.getInstanceId() + " уже есть регистр с типом " + registerTypeDuplicate.get());
//            }
//        } else {
//            throw new ProductNotFoundException("Для регистра не найден продукт с ID " + addRegister.getInstanceId());
//        }
//
//        Optional<String> checkRegisterType = registerService.checkRegisterType(registerType);
//
//        if (checkRegisterType.isPresent()) {
//            throw new RegisterNotFountException(checkRegisterType.get());
//        }
//
//        return registerService.addRegister(addRegister);
    }
}
