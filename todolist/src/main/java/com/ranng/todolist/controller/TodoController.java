package com.ranng.todolist.controller;

import com.ranng.todolist.pojo.Todo;
import com.ranng.todolist.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    @Autowired
    private TodoService todoService;  // Corrected typo

    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }

    @PostMapping
    public Todo addTodo(@RequestBody Todo todo) {
        return todoService.addTodo(todo);
    }

    @PutMapping("/{id}")
    public Todo updateTodo(@PathVariable Integer id, @RequestBody Todo todo) {  // Added @PathVariable
        return todoService.updateTodo(id, todo);
    }

    @DeleteMapping("/{id}")
    public Void deleteTodo(@PathVariable Integer id) {  // Changed return type to ResponseEntity<Void>
        todoService.deleteTodo(id);
        return null;
    }
}
