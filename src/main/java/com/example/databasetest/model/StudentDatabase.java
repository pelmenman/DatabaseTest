package com.example.databasetest.model;

import org.springframework.data.repository.CrudRepository;

public interface StudentDatabase extends CrudRepository<Student, Integer> {
}
