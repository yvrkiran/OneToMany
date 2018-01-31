package com.OneToMany.EmpAdrr.Service;

import com.OneToMany.EmpAdrr.Model.Employee;

import java.util.Optional;

public interface EmployeeService {
    Optional<Employee> findById(Long id);
}
