package com.example.task.service;

import com.example.task.model.TaskUser;

import java.util.List;

public interface TaskUserService {
    TaskUser addTaskUser(TaskUser taskUser);
    List<TaskUser> getAllTaskUsers();
    TaskUser getTaskUserById(Long id);
    TaskUser updateTaskUser(TaskUser taskUser);
    void deleteTaskUserById(Long id);
}
