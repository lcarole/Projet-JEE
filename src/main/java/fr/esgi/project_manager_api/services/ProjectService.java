package fr.esgi.project_manager_api.services;

import fr.esgi.project_manager_api.models.Project;

import java.util.List;

public interface ProjectService {
    Project create(Project user);
    List<Project> readAll();
    Project readById(int id);
    Project update(int id, Project project);
    String delete(int id);
}
