package com.ranng.todolist.service;

import com.ranng.todolist.pojo.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> getAllTodos();
    Todo getTodoById(Integer id);
    Todo addTodo(Todo todo);
    Todo updateTodo(Integer id, Todo todo);
    void deleteTodo(Integer id);
}
