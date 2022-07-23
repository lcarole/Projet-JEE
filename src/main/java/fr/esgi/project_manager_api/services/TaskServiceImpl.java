package fr.esgi.project_manager_api.services;

import fr.esgi.project_manager_api.models.Task;
import fr.esgi.project_manager_api.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService{
    private final TaskRepository taskRepository;

    @Override
    public Task create(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public List<Task> readAll() {
        return taskRepository.findAll();
    }

    @Override
    public Task readById(int id) {
        return taskRepository.getReferenceById(id);
    }

    @Override
    public Task update(int id, Task task) {
        return taskRepository.findById(id)
                .map(t ->{
                    t.setName(task.getName());
                    t.setStatus(task.getStatus());
                    t.setIduser(task.getIduser());
                    return taskRepository.save(t);
                }).orElseThrow(() -> new RuntimeException("tâche inexistante."));
    }

    @Override
    public String delete(int id) {
        taskRepository.delete(readById(id));
        return "La tâche a bien été effacée.";
    }
}

