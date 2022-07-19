package fr.esgi.project_manager_api.models;
import lombok.Data;

@Data

public class Task {
    public int idTask;
    public String name;
    public String status;
    public int idProject;
    public int idUser;

    public Task(int idTask, String name, String status, int idProject, int idUser) {
        this.idTask = idTask;
        this.name = name;
        this.status = status;
        this.idProject = idProject;
        this.idUser = idUser;
    }
}
