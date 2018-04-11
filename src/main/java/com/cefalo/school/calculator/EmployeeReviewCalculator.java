package com.cefalo.school.calculator;

import com.cefalo.school.data.Employee;

public class EmployeeReviewCalculator {
    public static Double calculate(Employee employee)  {
        ReviewCalculator calculator = new ReviewCalculator(employee.getSalary(),employee.getScore(), employee.getImpact());
        return calculator.calculate();
    }
}
