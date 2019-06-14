package com.example.demo1;

public class SimpleEmployeeService {

  public String getEmployeeName(int employeeId) {
    switch (employeeId) {
      case 0: return "Mark Kraus";
      case 1: return "Jag Jambur";
      case 2: return "Jarod Cahoon";
      default: return "";
    }
  }

}
