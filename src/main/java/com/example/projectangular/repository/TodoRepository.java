package com.example.projectangular.repository;

import com.example.projectangular.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
}