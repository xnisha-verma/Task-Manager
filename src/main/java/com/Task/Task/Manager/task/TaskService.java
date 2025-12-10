package com.Task.Task.Manager.task;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {
    private final TaskRepository repository;
    public TaskService(TaskRepository repository){
        this.repository = repository;
    }

    public List<Task> getAllTasks(){
        return repository.findAll();
    }
    public Task createTask(Task task){
        return repository.save(task);
    }
    public void deleteTask(Long taskId){
        if(!repository.existsById(taskId)){
            throw new IllegalStateException("Task not found");
        }
        repository.deleteById(taskId);
    }
    @Transactional
    public void updatetask(Long id, String title, String status){
        Task task = repository.findById(id)
                .orElseThrow(()-> new IllegalStateException("Task not found"));
        if(title!=null && title.length()>0){
            task.setTitle(title);
        }
        if(status!=null){
            task.setStatus(Task.Status.valueOf(status));
        }
    }
}
