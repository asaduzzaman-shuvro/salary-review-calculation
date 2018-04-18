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
        dev1.printInformation();

        Team team = getDummyTeam();
        team.printInformation();

        Project project = getDummyProject();
        project.printInformation();


    }

    public static Employee getDummyEmploye(){
        Impact impact = new Impact(0.7,0.7,0.7,0.7, 0.8);
        Score devScore = new Score(8, 3, 2, 7, 10);
        Employee employee = new Employee(200000.0,impact, devScore, "Dev1");


        return employee;
    }

    public static Employee getDummyCTO(){
        Impact impact = new Impact(0.7,0.7,0.7,0.7, 0.8);
        Score devScore = new Score(8, 3, 2, 7, 10);
        Employee employee = new Employee(2000000.0,impact, devScore,"CTO");
        employee.setRole(Role.Cto);

        return employee;
    }

    public static Team getDummyTeam(){
        Impact impact = new Impact(0.7,0.7,0.7,0.7, 0.8);

        Score devScore1 = new Score(8, 3, 2, 7, 10);
        Employee employee1 = new Employee(200000.0,impact, devScore1,"Dev1");

        Score devScore2 = new Score(8, 2, 2, 8, 10);
        Employee employee2 = new Employee(200000.0,impact, devScore2,"Dev2");

        Score devScore3 = new Score(8, 2, 3, 8, 9);
        Employee employee3 = new Employee(200000.0,impact, devScore3,"TeamLead");

        List<Employee>employees = new ArrayList<Employee>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        Team team = new  Team(employees, "NHST-DN");
        team.setTeamLead(employee3 );

        return team;
    }

    public static Project getDummyProject(){
        Impact impact = new Impact(0.7,0.8,0.8,0.9,0.8);
        // team 1
        Score devScore11 = new Score(8, 3, 2, 7, 10);
        Employee employee11 = new Employee(200000.0,impact, devScore11,"Dev1");

        Score devScore12 = new Score(8, 2, 2, 8, 10);
        Employee employee12 = new Employee(200000.0,impact, devScore12,"Dev2");

        Score devScore13 = new Score(8, 2, 3, 8, 9);
        Employee employee13 = new Employee(200000.0,impact, devScore13,"Dev3");

        List<Employee> employeesTeam1 = new ArrayList<>();
        employeesTeam1.addAll(Arrays.asList(employee11,employee12,employee13));
        Team team1 = new Team(employeesTeam1,"NHST-DN");
        team1.setTeamLead(employee13);

        // team 2
        Score devScore21 = new Score(8, 3, 2, 7, 10);
        Employee employee21 = new Employee(200000.0,impact, devScore21,"Dev1");

        Score devScore22 = new Score(8, 2, 2, 8, 10);
        Employee employee22 = new Employee(200000.0,impact, devScore22,"Dev2");

        Score devScore23 = new Score(8, 2, 3, 8, 9);
        Employee employee23 = new Employee(200000.0,impact, devScore23,"Dev3");

        List<Employee> employeesTeam2 = new ArrayList<>();
        employeesTeam2.addAll(Arrays.asList(employee21,employee22,employee23));
        Team team2 = new Team(employeesTeam2,"NHST-Global");
        team2.setTeamLead(employee23);

        Score pmScore = new Score(8, 2, 3, 8, 9);
        Employee pm = new Employee(200000.0,impact, pmScore,"Dev3");

        Project project = new Project(Arrays.asList(team1,team2),"NHST");
        project.setProjectManager(pm);
        return project;
    }
}
