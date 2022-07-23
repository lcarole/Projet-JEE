package fr.esgi.project_manager_api.models;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "task")
@Getter
@Setter
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idtask;
    @Column(length = 100)
    private String name;
    private int status;
    private int idproject;
    private int iduser;
}
