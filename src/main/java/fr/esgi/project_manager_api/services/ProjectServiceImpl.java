package fr.esgi.project_manager_api.services;

import fr.esgi.project_manager_api.models.Project;
import fr.esgi.project_manager_api.repository.ProjectRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjectServiceImpl implements ProjectService{
    private final ProjectRepository projectRepository;

    @Override
    public Project create(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public List<Project> readAll() {
        return projectRepository.findAll();
    }

    @Override
    public Project readById(int id) {
        return projectRepository.getReferenceById(id);
    }

    @Override
    public Project update(int id, Project project) {
        return projectRepository.findById(id)
                .map(p ->{
                    p.setDescription(project.getDescription());
                    p.setName(project.getName());
                    return projectRepository.save(p);
                }).orElseThrow(() -> new RuntimeException("Projet non trouvé."));
    }

    @Override
    public String delete(int id) {
        projectRepository.delete(readById(id));
        return "Le projet a bien été supprimé.";
    }
}
