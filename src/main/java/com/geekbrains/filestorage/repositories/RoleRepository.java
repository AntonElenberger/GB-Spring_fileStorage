package com.geekbrains.filestorage.repositories;

import com.geekbrains.filestorage.entities.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findOneByName(String roleName);
}
