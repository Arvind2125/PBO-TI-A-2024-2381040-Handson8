package repositories;

import entities.TodoList;

public interface TodoListRepository {
    TodoList[] getAll();
    void add(TodoList todoList);
    Boolean remove(Integer id);
    Boolean edit(Integer todolist);

    Boolean edit(TodoList todoList);
}