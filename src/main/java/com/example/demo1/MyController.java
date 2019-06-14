package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {

  private AdvancedEmployeeService _advancedEmployeeService;

  @Autowired
  public MyController(AdvancedEmployeeService advancedEmployeeService) {
    this._advancedEmployeeService = advancedEmployeeService;
  }


  @GetMapping("/greeting")
  public String greeting() {
    return "hello world!";
  }

  @GetMapping("/employee/{employeeId}")
  public String getEmployeeName(@PathVariable int employeeId) {
    return _advancedEmployeeService.getEmployeeName(employeeId);
  }
}
