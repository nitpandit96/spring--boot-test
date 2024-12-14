package com.nsp.service;

import com.nsp.model.Employee;
import com.nsp.repository.EmployeeRepo;
import com.nsp.request.EmployeeRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements IEmployeeService {

    private final EmployeeRepo employeeRepo;

    @Override
    public void signUp(Employee employee) {
        employeeRepo.save(employee);
    }

    @Override
    public boolean signIn(String emailId, String pass) {
        boolean flag= false;
        Employee employee = null;
        EmployeeRequest employeeRequest = null;
        if (employeeRequest.getEmailId().equalsIgnoreCase(employee.getEmailId()) && employeeRequest.getPassword().equalsIgnoreCase(employee.getPassword())){
            flag=true;
        }
        return flag;
    }
    }

