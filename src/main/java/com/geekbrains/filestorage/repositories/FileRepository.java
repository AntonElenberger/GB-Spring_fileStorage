package com.geekbrains.filestorage.repositories;

import com.geekbrains.filestorage.entities.File;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends CrudRepository<File, Long> {
    File findOneByName(String name);
}
