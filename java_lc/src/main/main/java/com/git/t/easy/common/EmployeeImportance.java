package com.git.t.easy.common;

import java.util.List;

public class EmployeeImportance {

  public int getImportance(List<Employee> employees, int id) {
    Employee[] map = new Employee[2001];

    for (Employee employee : employees) {
      map[employee.id] = employee;
    }
    return dsf(map[id], map);
  }

  private int dsf(Employee employee, Employee[] map) {
    int ret = employee.importance;
    if (employee.subordinates == null || employee.subordinates.isEmpty()) {
      return ret;
    }
    for (int i : employee.subordinates) {
      ret += dsf(map[i], map);
    }
    return ret;
  }
}
