package com.github.rusichpt.taco_cloud_auth_server.repositories;

import com.github.rusichpt.taco_cloud_auth_server.model.User;
import org.springframework.data.repository.ListCrudRepository;

public interface UserRepository extends ListCrudRepository<User, Long> {
    User findByUsername(String username);
}
