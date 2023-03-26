package com.frank.employeeregistrationproject.bootstrap;

import com.frank.employeeregistrationproject.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataGenerator {

    private static List<Employee> employeeList = new ArrayList<>();

    public static void saveEmployee(Employee employee){
        employeeList.add(employee);
    }

    public static List<Employee> readAllEmployees(){
        return employeeList;
    }

    public static List<String> getAllStates(){
        List<String> stateList = Arrays.asList("ON", "BC", "MB", "NW", "SC", "YK", "NF");
        return stateList;
    }
}
