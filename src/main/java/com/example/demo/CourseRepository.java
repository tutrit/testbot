package com.example.demo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource//(excerptProjection = StudentProjections.class)
public interface CourseRepository extends PagingAndSortingRepository<MyCourse, Long> {
    List<MyCourse> findAllByName(@Param("name") String name);
}
