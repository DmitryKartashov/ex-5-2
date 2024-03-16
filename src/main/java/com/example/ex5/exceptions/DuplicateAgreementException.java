package com.example.ex5.exceptions;

import lombok.Getter;

import java.util.List;

@Getter
public class DuplicateAgreementException extends RuntimeException{
    private final List<String> errors;

    public DuplicateAgreementException(List<String> errors) {
        this.errors = errors;
    }
}
