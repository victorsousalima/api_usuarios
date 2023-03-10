package br.com.vitinho.ApiUsers.controllers;

import br.com.vitinho.ApiUsers.model.entites.User;
import br.com.vitinho.ApiUsers.model.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public Optional<User> obterUsuarioPorId(Long id) {
        return userRepository.findById(id);
    }
}
