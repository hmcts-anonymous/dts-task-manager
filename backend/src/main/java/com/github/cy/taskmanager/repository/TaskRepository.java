package com.github.cy.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.github.cy.taskmanager.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
