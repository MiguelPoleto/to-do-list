package br.com.todolist.todolist.task;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface TaskRepository extends JpaRepository<TaskModel, UUID>{
    List<TaskModel> findByIdUser(UUID idUser);

    TaskModel findByIdAndIdUser(UUID id, UUID idUser);
}
