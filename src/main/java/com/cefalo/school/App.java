package com.cefalo.school;

import com.cefalo.school.calculator.*;
import com.cefalo.school.data.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        Employee dev1 = getDummyEmploye();
        System.out.println("Employee review: " + dev1.calculateReview());

        Team team = getDummyTeam();
        System.out.println("Team Review: " + team.calculateReview());

        Project project = getDummyProject();
        System.out.println("Project Review: " + project.calculateReview());


    }

    public static Employee getDummyEmploye(){
        Impact impact = new Impact(0.7,0.7,0.7,0.7, 0.8);
        Score devScore = new Score(8, 3, 2, 7, 10);
        Employee employee = new Employee(200000.0,impact, devScore);


        return employee;
    }

    public static Employee getDummyCTO(){
        Impact impact = new Impact(0.7,0.7,0.7,0.7, 0.8);
        Score devScore = new Score(8, 3, 2, 7, 10);
        Employee employee = new Employee(2000000.0,impact, devScore);
        employee.setRole(Role.Cto);

        return employee;
    }

    public static Team getDummyTeam(){
        Impact impact = new Impact(0.7,0.7,0.7,0.7, 0.8);

        Score devScore1 = new Score(8, 3, 2, 7, 10);
        Employee employee1 = new Employee(200000.0,impact, devScore1);

        Score devScore2 = new Score(8, 2, 2, 8, 10);
        Employee employee2 = new Employee(200000.0,impact, devScore2);

        Score devScore3 = new Score(8, 2, 3, 8, 9);
        Employee employee3 = new Employee(200000.0,impact, devScore2);
        employee3.setRole(Role.TeamLead);

        List<Employee>employees = new ArrayList<Employee>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        return new Team(employees);

    }

    public static Project getDummyProject(){
        Impact impact = new Impact(0.7,0.8,0.8,0.9,0.8);
        // team 1
        Score devScore11 = new Score(8, 3, 2, 7, 10);
        Employee employee11 = new Employee(200000.0,impact, devScore11);

        Score devScore12 = new Score(8, 2, 2, 8, 10);
        Employee employee12 = new Employee(200000.0,impact, devScore12);

        Score devScore13 = new Score(8, 2, 3, 8, 9);
        Employee employee13 = new Employee(200000.0,impact, devScore13);

        List<Employee> employeesTeam1 = new ArrayList<>();
        employeesTeam1.addAll(Arrays.asList(employee11,employee12,employee13));
        Team team1 = new Team(employeesTeam1);

        // team 2
        Score devScore21 = new Score(8, 3, 2, 7, 10);
        Employee employee21 = new Employee(200000.0,impact, devScore21);

        Score devScore22 = new Score(8, 2, 2, 8, 10);
        Employee employee22 = new Employee(200000.0,impact, devScore22);

        Score devScore23 = new Score(8, 2, 3, 8, 9);
        Employee employee23 = new Employee(200000.0,impact, devScore23);

        List<Employee> employeesTeam2 = new ArrayList<>();
        employeesTeam2.addAll(Arrays.asList(employee21,employee22,employee23));
        Team team2 = new Team(employeesTeam2);

        return new Project(Arrays.asList(team1,team2));
    }
}
