package com.employees;

public class Manager extends Employee {
    private double fixedSalary;
    private double bonus;

    public Manager(String name, int employeeId, String position, double fixedSalary, double bonus) {
        super(name, employeeId, position);
        this.fixedSalary = fixedSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return fixedSalary + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "Фиксированная зарплата: " + fixedSalary + ", Премия: " + bonus;
    }
}

