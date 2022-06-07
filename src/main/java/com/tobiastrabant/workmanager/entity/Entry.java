package com.tobiastrabant.workmanager.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.Set;

@MappedSuperclass
public abstract class Entry {

    public enum EntryPriority
    {
        LOW("Low"),
        MEDIUM("Medium"),
        HIGH("High");

        private final String displayValue;

        private EntryPriority(String displayValue) {
            this.displayValue = displayValue;
        }

        public String getDisplayValue() {
            return displayValue;
        }
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @NotBlank(message = "Name is required")
    private String name;
    @NotBlank(message = "Description is required")
    private String description;
    private EntryPriority priority;
    //private User creator;
    @CreationTimestamp
    private LocalDateTime creationTime;
    @UpdateTimestamp
    private LocalDateTime lastUpdated;
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "assignedProjects")
    private Set<Employee> assignedEmployees;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EntryPriority getPriority() {
        return priority;
    }

    public void setPriority(EntryPriority priority) {
        this.priority = priority;
    }

/*    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }*/

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

/*    public User[] getAssignedEmployees() {
        return assignedEmployees;
    }

    public void setAssignedEmployees(User[] assignedEmployees) {
        this.assignedEmployees = assignedEmployees;
    }*/
}

