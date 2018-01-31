package com.OneToMany.EmpAdrr.Controller;

import com.OneToMany.EmpAdrr.Model.Employee;
import com.OneToMany.EmpAdrr.Service.EmployeeService;
import com.OneToMany.EmpAdrr.Util.CustomErrorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/emp")
public class EmpAddrController {

    @Autowired
    private
    EmployeeService employeeService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody
    ResponseEntity<?> getUser(@PathVariable("id") long id) {

        Optional<Employee> employee = employeeService.findById(id);
        if (!employee.isPresent()) {
            return new ResponseEntity<>(new CustomErrorType("User with id " + id
                    + " not found"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public @ResponseBody
//    Employee getUser(@PathVariable("id") long id) throws AccountNotFoundException {
//
//        Optional<Employee> employee = employeeService.findById(id);
//        return employee.get();
//    }
}
