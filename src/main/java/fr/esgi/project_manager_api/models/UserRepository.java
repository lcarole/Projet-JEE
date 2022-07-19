package fr.esgi.project_manager_api.models;

import java.util.List;

public interface UserRepository {
    User store(User user);

    int count();

    List<User> findAll();

    void deleteAll();
}
