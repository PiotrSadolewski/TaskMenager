package com.example.task.controller;

import com.example.task.model.TaskUser;
import com.example.task.service.TaskUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/taskUser")
public class TaskUserController {
    public final TaskUserService taskUserService;

    public TaskUserController(TaskUserService taskUserService) {
        this.taskUserService = taskUserService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<TaskUser>> getAllTaskUsers() {
        List<TaskUser> taskUsers = taskUserService.getAllTaskUsers();
        return new ResponseEntity<>(taskUsers, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<TaskUser> getTaskUserById(@PathVariable("id") Long id) {
        TaskUser taskUser = taskUserService.getTaskUserById(id);
        return new ResponseEntity<>(taskUser, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<TaskUser> addTaskUser(@RequestBody TaskUser taskUser) {
        TaskUser newTaskUser = taskUserService.addTaskUser(taskUser);
        return new ResponseEntity<>(newTaskUser, HttpStatus.CREATED);
    }

    @PostMapping("/update")
    public ResponseEntity<TaskUser> updateTaskUser(@RequestBody TaskUser taskUser) {
        TaskUser updateTaskUser = taskUserService.updateTaskUser(taskUser);
        return new ResponseEntity<>(updateTaskUser, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteTaskUserById(@PathVariable("id") Long id) {
        taskUserService.deleteTaskUserById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
