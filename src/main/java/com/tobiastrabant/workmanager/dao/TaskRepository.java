package com.tobiastrabant.workmanager.dao;

import com.tobiastrabant.workmanager.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface TaskRepository extends JpaRepository<Task, Integer> {
}
