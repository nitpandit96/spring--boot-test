package com.nsp.service;


import com.nsp.model.Employee;

public interface IEmployeeService {
    void signUp(Employee employee);
    boolean signIn(String emailId, String pass);
}
