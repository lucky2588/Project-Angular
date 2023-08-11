package com.example.projectangular.controller;

import com.example.projectangular.entity.Todo;
import com.example.projectangular.resquest.ResquestCreateTodo;
import com.example.projectangular.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/todoApp")
public class TodoResource {
    @Autowired
    private TodoService service;

    @GetMapping("/users/{user_name}/todos")
    public List<Todo> getAll(@PathVariable String user_name){
        return service.getAll();
    }
    @GetMapping("/users/{user_name}/todos/{todo_id}")
    public Todo getTodoById(@PathVariable String user_name,@PathVariable Integer todo_id){
        return service.getTodoByID(todo_id);
    }

    @DeleteMapping("/users/{user_name}/todos/{todo_id}")
    public void deleteTodo(@PathVariable String user_name,@PathVariable Integer todo_id){
         service.removeTodo(user_name,todo_id);
    }

    @PutMapping("/users/{user_name}/todos/{todo_id}")
    public Todo UpdateTodo(@PathVariable String user_name, @PathVariable Integer todo_id, @RequestBody ResquestCreateTodo resquest){
        return service.updateTodo(user_name,todo_id,resquest);
    }

    @PostMapping("users/{user_name}/todos/")
    public Todo CreateTodo(@PathVariable String user_name,@RequestBody ResquestCreateTodo resquest){
        return service.createTodo(resquest);
    }

}
