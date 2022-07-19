package fr.esgi.project_manager_api.models;

public class Project {
    public int idProject;
    public String name;
    public String description;

    public Project(int idProject, String name, String description) {
        this.idProject = idProject;
        this.name = name;
        this.description = description;
    }
}
