package sda.zadaniezespringa.construction_store.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sda.zadaniezespringa.construction_store.model.User;
import sda.zadaniezespringa.construction_store.repository.UserRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    public User save(User user) {
        return userRepository.save(user);
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

}
