package com.github.cy.taskmanager.dto;

import com.github.cy.taskmanager.model.Task;
import com.github.cy.taskmanager.model.TaskStatus;

import java.time.LocalDateTime;

public record TaskResponse(
    Long id,
    String title,
    String description,
    TaskStatus status,
    LocalDateTime dueDateTime
) {
    public static TaskResponse from(Task task) {
        return new TaskResponse(
            task.getId(),
            task.getTitle(),
            task.getDescription(),
            task.getStatus(),
            task.getDueDateTime()
        );
    }
}
