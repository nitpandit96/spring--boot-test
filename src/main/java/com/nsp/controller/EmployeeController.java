package com.nsp.controller;

import com.nsp.model.Employee;
import com.nsp.service.IEmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class EmployeeController {

    private final IEmployeeService iEmployeeService;

    @PostMapping("/signUp")
    public ResponseEntity<String> signUp(@RequestBody Employee employee){
        iEmployeeService.signUp(employee);
        return ResponseEntity.ok("Sign Up Successfullys");
    }
    @PostMapping("/signIn")
    public void signIn(@RequestBody String empId, String pass){
        iEmployeeService.signIn(empId,pass);
    }
}
