package com.devsuperior.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.demo.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    

    @Query(nativeQuery = true,
        value = "SELECT * FROM tb_department ORDER BY tb_department.name")
    public List<Department> findAll();
}
