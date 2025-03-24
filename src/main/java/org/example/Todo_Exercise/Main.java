package org.example.Todo_Exercise;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        TodoItem newTodoItem = new TodoItem();
        LocalDate testDate = LocalDate.of(2025,3,23);
        newTodoItem.setDeadLine(testDate);
        System.out.println(newTodoItem.getDeadLine());
        System.out.println(newTodoItem.isOverdue());
    }
}
