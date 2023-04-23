package com.example.task.repository;

import com.example.task.model.TaskUser;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TaskUserRepository extends JpaRepository<TaskUser, Long>{

}
