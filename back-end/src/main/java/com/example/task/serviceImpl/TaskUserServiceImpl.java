package com.example.task.serviceImpl;

import com.example.task.model.TaskUser;
import com.example.task.repository.TaskUserRepository;
import com.example.task.service.TaskUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskUserServiceImpl implements TaskUserService {
    private TaskUserRepository taskUserRepository;

    @Autowired
    public TaskUserServiceImpl(TaskUserRepository taskUserRepository) {
        this.taskUserRepository = taskUserRepository;
    }
    @Override
    public TaskUser addTaskUser(TaskUser taskUser) {
        return taskUserRepository.save(taskUser);
    }

    @Override
    public List<TaskUser> getAllTaskUsers() {
        return taskUserRepository.findAll();
    }

    @Override
    public TaskUser getTaskUserById(Long id) {
        return taskUserRepository.findById(id).orElse(null);
    }

    @Override
    public TaskUser updateTaskUser(TaskUser taskUser) {
        return taskUserRepository.save(taskUser);
    }

    @Override
    public void deleteTaskUserById(Long id) {
        taskUserRepository.deleteById(id);
    }
}
