package com.bruce.mscdept.Repository;

import com.bruce.mscdept.Entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Long> {
}
