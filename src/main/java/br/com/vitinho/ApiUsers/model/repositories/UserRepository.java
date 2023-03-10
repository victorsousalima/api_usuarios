package br.com.vitinho.ApiUsers.model.repositories;

import br.com.vitinho.ApiUsers.model.entites.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
