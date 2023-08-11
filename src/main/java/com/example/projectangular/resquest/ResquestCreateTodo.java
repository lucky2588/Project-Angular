package com.example.projectangular.resquest;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResquestCreateTodo{
    @NotEmpty(message = "this field not empty")
    public String username;
    @NotEmpty(message = "this field not empty")
    public String description;
    @NotEmpty(message = "this field not empty")
    public LocalDate time;
    public Boolean done;

}
