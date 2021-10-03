package com.git.t.easy.common;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class EmployeeImportanceTest {

  @Test
  void getImportance() {
    EmployeeImportance employeeImportance = new EmployeeImportance();

    List<Employee> employees = new java.util.ArrayList<>();
    Employee e = new Employee();
    e.id = 1;
    e.importance = 1;
    employees.add(e);
    assertEquals(1, employeeImportance.getImportance(
        employees, 1));
  }
}