package com.svj.repository;

import com.svj.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "students-api", path = "students-api")
public interface StudentRepository extends JpaRepository<Student, Integer> {

    public List<Student> findBySection(String section);
}
