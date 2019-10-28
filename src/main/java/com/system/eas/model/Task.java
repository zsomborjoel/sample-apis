package com.system.eas.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long taskId;
    private long employeeId;
    private String taskName;
    private String taskDate;
    private String taskStartTime;
    private String taskEndTime;

    public Task() {
    }

    public Task(@JsonProperty("taskId") long taskId,
                @JsonProperty("employeeId") long employeeId,
                @JsonProperty("taskName") String taskName,
                @JsonProperty("taskDate") String taskDate,
                @JsonProperty("taskStartTime") String taskStartTime,
                @JsonProperty("taskEndTime") String taskEndTime) {
        this.taskId = taskId;
        this.employeeId = employeeId;
        this.taskName = taskName;
        this.taskDate = taskDate;
        this.taskStartTime = taskStartTime;
        this.taskEndTime = taskEndTime;
    }

    public long getTaskId() {
        return this.taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public long getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getTaskName() {
        return this.taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDate() {
        return this.taskDate;
    }

    public void setTaskDate(String taskDate) {
        this.taskDate = taskDate;
    }

    public String getTaskStartTime() {
        return this.taskStartTime;
    }

    public void setTaskStartTime(String taskStartTime) {
        this.taskStartTime = taskStartTime;
    }

    public String getTaskEndTime() {
        return this.taskEndTime;
    }

    public void setTaskEndTime(String taskEndTime) {
        this.taskEndTime = taskEndTime;
    }
   
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Task)) {
            return false;
        }
        Task task = (Task) o;
        return taskId == task.taskId 
                && employeeId == task.employeeId 
                && Objects.equals(taskName, task.taskName) 
                && Objects.equals(taskDate, task.taskDate) 
                && Objects.equals(taskStartTime, task.taskStartTime) 
                && Objects.equals(taskEndTime, task.taskEndTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
                            employeeId,
                            taskName,
                            taskDate,
                            taskStartTime,
                            taskEndTime);
    }

    @Override
    public String toString() {
        return "{" +
            " taskId='" + getTaskId() + "'" +
            ", employeeId='" + getEmployeeId() + "'" +
            ", taskName='" + getTaskName() + "'" +
            ", taskDate='" + getTaskDate() + "'" +
            ", taskStartTime='" + getTaskStartTime() + "'" +
            ", taskEndTime='" + getTaskEndTime() + "'" +
            "}";
    }

}