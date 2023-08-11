package com.example.projectangular.service;

import com.example.projectangular.entity.Todo;
import com.example.projectangular.repository.TodoRepository;
import com.example.projectangular.resquest.ResquestCreateTodo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;


    public List<Todo> getAll() {
        return todoRepository.findAll();
    }

    public void removeTodo(String userName, Integer todoId){
        Todo item = todoRepository.findById(todoId).orElseThrow(()->{
            throw new RuntimeException("Not found Todo with ID "+todoId);
        });
        todoRepository.delete(item);
    }


    public Todo createTodo(ResquestCreateTodo resquest){
       Todo item = Todo.builder()
               .username(resquest.getUsername())
               .description(resquest.getDescription())
               .time(resquest.getTime())
               .isDone(false)
               .build();
       todoRepository.save(item);
       return item;
    }


    public Todo updateTodo(String username,Integer todoId , ResquestCreateTodo resquest){
       Todo item = todoRepository.findById(todoId).orElseThrow(
               ()-> {
                   throw new RuntimeException("Not found Todo with Id "+todoId);
               }
       );
       item.setUsername(resquest.getUsername());
          item.setDone(false);
       item.setDescription(resquest.getDescription());
       item.setTime(resquest.getTime());
        todoRepository.save(item);
        return item;
    }


    public Todo getTodoByID(Integer todoId) {
        return todoRepository.findById(todoId).orElseThrow(
                ()->{
                    throw new RuntimeException("Not found Todo with Id "+todoId);
                }
        );
    }
}
