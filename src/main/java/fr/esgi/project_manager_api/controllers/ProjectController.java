package fr.esgi.project_manager_api.controllers;

import fr.esgi.project_manager_api.models.Project;
import fr.esgi.project_manager_api.services.ProjectService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/project")
@AllArgsConstructor
public class ProjectController {
    private final ProjectService projectService;

    @PostMapping("/create")
    public Project create(@RequestBody Project newProject){
        return projectService.create(newProject);
    }

    @GetMapping("/all")
    public List<Project> getAll(){
        return projectService.readAll();
    }

    @GetMapping("/id")
    public Project getProject(@RequestParam Integer idProject){
        return projectService.readById(idProject);
    }

    @DeleteMapping("/delete")
    public String delete(@RequestParam Integer id){
        return projectService.delete(id);
    }
}
