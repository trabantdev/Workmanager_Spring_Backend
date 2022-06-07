package com.tobiastrabant.workmanager.dao;

import com.tobiastrabant.workmanager.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}
