package com.tobiastrabant.workmanager.entity;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Table;

@Component
@Entity
@Table(name = "project")
public class Project extends TimedEntry{
}
