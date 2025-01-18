package com.ranng.todolist.service;
import com.ranng.todolist.mapper.TodoMapper;
import com.ranng.todolist.pojo.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TodoServicelmpl implements TodoService{
    @Autowired
    private TodoMapper todoMapper;


    @Override
    public List<Todo> getAllTodos() {
        return todoMapper.selectAll();
    }

    @Override
    public Todo getTodoById(Integer id) {
        return todoMapper.selectById(id);
    }

    @Override
    public Todo addTodo(Todo todo) {
         todoMapper.insert(todo);
         return todo;
    }

    @Override
    public Todo updateTodo(Integer id, Todo todo) {
         todoMapper.update(todo);
         return todo;
    }

    @Override
    public void deleteTodo(Integer id) {
        todoMapper.deleteById(id);
    }
}
