package com.bruce.mscdept.Repository;

import com.bruce.mscdept.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
