package br.com.vitinho.ApiUsers.controllers;

import br.com.vitinho.ApiUsers.model.entites.User;
import br.com.vitinho.ApiUsers.model.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public Iterable<User> obterTodosUsuarios() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> obterUsuarioPorId(@PathVariable Long id) {
        return userRepository.findById(id);
    }

    @PostMapping
    public @ResponseBody User inserirUsuario(User usuario) {
        userRepository.save(usuario);
        return usuario;
    }

    @PutMapping
    public @ResponseBody User atualizarUsuario(User usuario) {
        userRepository.save(usuario);
        return usuario;
    }

    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable Long id) {
        userRepository.deleteById(id);
    }
}
