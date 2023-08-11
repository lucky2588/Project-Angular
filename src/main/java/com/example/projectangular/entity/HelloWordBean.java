package com.example.projectangular.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class HelloWordBean {
    private String messeage;

    public HelloWordBean(String messeage) {
        this.messeage = messeage;
    }
}
