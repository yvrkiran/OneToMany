package com.OneToMany.EmpAdrr.Service;

import com.OneToMany.EmpAdrr.Model.Employee;
import com.OneToMany.EmpAdrr.Repositories.EmployeeRepository;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class EmployeeServiceImpTest{

    EmployeeServiceImp employeeServiceImp;

    @Test
    public void Test1() {
        employeeServiceImp = new EmployeeServiceImp();

        String output = employeeServiceImp.getName();
        assert(output.equals("ravi"));
    }

    @Test
    public void testFindById(){
        //given
            employeeServiceImp = new EmployeeServiceImp();
            Employee employee = new Employee();
            employee.setFirstName("ravi");
            employee.setLastName("kiran");
        //mock
            EmployeeRepository employeeRepositoryMock = mock(EmployeeRepository.class);
            employeeServiceImp.setEmployeeRepository(employeeRepositoryMock);
            when(employeeRepositoryMock.findById(1L)).thenReturn(Optional.ofNullable(employee));
//            PowerMockito
        //when

             Optional<Employee> output = employeeServiceImp.findById(1L);
        //asserting
            assert(output.get().getFirstName().equals("ravi"));

    }

}