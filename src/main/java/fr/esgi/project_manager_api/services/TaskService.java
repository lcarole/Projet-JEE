package fr.esgi.project_manager_api.services;

import fr.esgi.project_manager_api.models.Task;

import java.util.List;

public interface TaskService {
    Task create(Task task);
    List<Task> readAll();
    Task readById(int id);
    Task update(int id, Task task);
    String delete(int id);
}
