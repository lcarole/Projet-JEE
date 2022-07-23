package fr.esgi.project_manager_api.services;

import fr.esgi.project_manager_api.models.User;
import fr.esgi.project_manager_api.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> readAll() {
        return userRepository.findAll();
    }

    @Override
    public User readById(int id) {
        return userRepository.getReferenceById(id);
    }

    @Override
    public User update(int id, User user) {
        return userRepository.findById(id)
                .map(u ->{
                    u.setEmail(user.getEmail());
                    u.setFirstname(user.getFirstname());
                    u.setLastname(user.getLastname());
                    u.setPassword(user.getPassword());
                    return userRepository.save(u);
                }).orElseThrow(() -> new RuntimeException("Utilisateur inconnu."));
    }

    @Override
    public String delete(int id) {
        userRepository.delete(readById(id));
        return "L'utilisateur a bien été supprimé.";
    }
}
