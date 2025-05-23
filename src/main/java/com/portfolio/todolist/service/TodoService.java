package com.portfolio.todolist.service;

import com.portfolio.todolist.domain.Todo;
import com.portfolio.todolist.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public void addTodo(Todo todo) {
        todoRepository.addTodo(todo);
    }

    public void toggleCompleted(Long id, boolean completed) {
        todoRepository.updateCompleted(id, completed);
    }

    public void deleteTodo(Long id) {
        todoRepository.deleteTodo(id);
    }
}
