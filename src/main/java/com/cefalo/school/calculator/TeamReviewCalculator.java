package com.cefalo.school.calculator;

import com.cefalo.school.data.Employee;
import com.cefalo.school.data.Team;

import java.util.List;

public class TeamReviewCalculator {
    public static Double calculate(Team team){
        Double review = 0.0;
        for (Employee employee : team.getEmployees()){
            review += EmployeeReviewCalculator.calculate(employee);
        }
        return review;
    }
}
