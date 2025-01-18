package com.ranng.todolist.mapper;

import com.ranng.todolist.pojo.Todo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TodoMapper {
    List<Todo> selectAll();
    Todo selectById(int id);
    int insert(Todo todo);
    int update(Todo todo);
    int deleteById(int id);
}
