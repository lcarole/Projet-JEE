package fr.esgi.project_manager_api.controllers;

import fr.esgi.project_manager_api.models.Task;
import fr.esgi.project_manager_api.services.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/task")
@AllArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @PostMapping("/create")
    public Task create(@RequestBody Task newTask){
        return taskService.create(newTask);
    }

    @GetMapping("/all")
    public List<Task> getAll(){
        return taskService.readAll();
    }

    @GetMapping("/id")
    public Task getTask(@RequestParam Integer idTask){
        return taskService.readById(idTask);
    }

    @DeleteMapping("/delete")
    public String delete(@RequestParam Integer id){
        return taskService.delete(id);
    }
}
