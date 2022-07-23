package fr.esgi.project_manager_api.models;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "project")
@Getter
@Setter
@NoArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idproject;
    @Column(length = 50)
    private String name;
    @Column(length = 250)
    private String description;
}
