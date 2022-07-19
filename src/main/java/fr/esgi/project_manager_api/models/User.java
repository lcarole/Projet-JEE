package fr.esgi.project_manager_api.models;

public class User {
    public int idUser;
    public String firstname;
    public String lastname;
    public String email;
    public String password;

    public User(int idUser, String firstname, String lastname, String email, String password) {
        this.idUser = idUser;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
    }
}
