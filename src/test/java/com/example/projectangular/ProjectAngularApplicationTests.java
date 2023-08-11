package com.example.projectangular;

import com.example.projectangular.entity.Todo;
import com.example.projectangular.repository.TodoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import java.util.Date;


@SpringBootTest
class ProjectAngularApplicationTests {
    @Autowired
    private TodoRepository repository;

    @Test
    void contextLoads() {
    }



}
