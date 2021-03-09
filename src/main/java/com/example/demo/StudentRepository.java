package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface StudentRepository extends CrudRepository<Student, Long> {
    List<Student> findAllByName(@Param("name") String name );
}
