package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class AdvancedEmployeeService {

  @Autowired
  public AdvancedEmployeeService(DBService dbService) {
    // pretend to do some importajnt stuff...
  }

  @Cacheable("employee")
  public String getEmployeeName(int employeeId) {

    System.out.println("get employee name called...");

    switch (employeeId) {
      case 0: return "Mark Kraus";
      case 1: return "Jag Jambur";
      case 2: return "Jarod Cahoon";
      default: return "";
    }
  }
}
