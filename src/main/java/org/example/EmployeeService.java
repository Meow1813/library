package org.example;

public interface EmployeeService {
    String findEmployee(String firstName, String lastName);

    String deleteEmployee(String firstName, String lastName);

    String addEmployee(String firstName, String lastName, int department, int salary);

    String printEmployeeList();

}
