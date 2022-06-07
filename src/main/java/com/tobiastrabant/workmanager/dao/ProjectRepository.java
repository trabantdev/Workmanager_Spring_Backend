package com.tobiastrabant.workmanager.dao;

import com.tobiastrabant.workmanager.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
