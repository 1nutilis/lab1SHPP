package com.employees;

public abstract class Employee {
    private String name;
    private int employeeId;
    private String position;

    public Employee(String name, int employeeId, String position) {
        this.name = name;
        this.employeeId = employeeId;
        this.position = position;
    }

    public abstract double calculateSalary();

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Сотрудник: " + name + " (ID: " + employeeId + "), Должность: " + position;
    }
}

