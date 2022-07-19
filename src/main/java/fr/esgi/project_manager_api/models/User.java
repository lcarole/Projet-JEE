package fr.esgi.project_manager_api.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "user", schema = "public")
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int iduser;
    @Column(length = 50)
    private String lastname;
    @Column(length = 50)
    private String firstname;
    @Column(length = 50)
    private String email;
    @Column(length = 50)
    private String password;
}
