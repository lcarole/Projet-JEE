package fr.esgi.project_manager_api.services;

import fr.esgi.project_manager_api.models.User;

import java.util.List;

public interface UserService {
    User create(User user);
    List<User> readAll();
    User readById(int id);
    User update(int id, User user);
    void delete(int id);
}
