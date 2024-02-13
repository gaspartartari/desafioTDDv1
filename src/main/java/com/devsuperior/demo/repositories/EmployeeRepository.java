package com.devsuperior.demo.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.demo.entities.Employee;

public interface EmployeeRepository extends JpaRepository <Employee, Long> {
    

    @Query(nativeQuery = true,
        value = "SELECT DISTINCT * FROM tb_employee e ORDER BY e.name", 
        countQuery = "SELECT COUNT(e.id) FROM tb_employee e")
    public Page<Employee> findAll(Pageable pageable);
}
