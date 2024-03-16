package com.example.ex5.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum AccountType {
    Client("Клиентский"),
    InnerBank("Внутрибанковский");

    public final String label;
}
