package com.employees;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем список сотрудников
        List<Employee> employees = new ArrayList<>();

        // Добавляем рабочих
        Worker worker1 = new Worker("Иванов Иван", 101, "Рабочий", 20, 160);
        Worker worker2 = new Worker("Сергеев Сергей", 102, "Рабочий", 22, 150);

        // Добавляем менеджеров
        Manager manager1 = new Manager("Крутой чел", 201, "Менеджер", 3000, 500);
        Manager manager2 = new Manager("Ультра крутойчел", 202, "Менеджер", 3500, 700);

        // Добавляем сотрудников в систему
        employees.add(worker1);
        employees.add(worker2);
        employees.add(manager1);
        employees.add(manager2);

        // Выводим информацию о сотрудниках и их зарплатах
        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.println("Заработок: " + employee.calculateSalary());
            System.out.println();
        }
    }
}
