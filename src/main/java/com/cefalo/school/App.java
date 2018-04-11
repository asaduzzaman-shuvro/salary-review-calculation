package com.cefalo.school;

import com.cefalo.school.calculator.*;
import com.cefalo.school.data.*;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        /*Team 1*/
        /*Score tl1Score = new Score(8, 3, 2, 7, 10);
        TeamLeader emp4 = new TeamLeader("TL 1", "NV", 15000, tl1Score);

        Score devScore = new Score(8, 3, 2, 7, 10);
        Employee dev1 = new Employee("Dev 1", "GB", 10000, devScore);
        Employee dev2 = new Employee("Dev 2", "GB", 20000, devScore);
        Employee dev3 = new Employee("Dev 3", "GB", 30000, devScore);*/

        /*Team 2*/
        /*Score tlScore = new Score(8, 3, 2, 7, 10);
        TeamLeader emp4 = new TeamLeader("TL 2", "NV", 15000, tlScore);

        Score devScore = new Score(8, 3, 2, 7, 10);
        Employee dev4 = new Employee("Dev 3", "GB", 10000, devScore);
        Employee emp5 = new Employee("Dev 4", "GB", 20000, devScore);
        Employee emp6 = new Employee("Dev 5", "GB", 30000, devScore);*/

        Employee dev1 = getDummyEmploye();
        System.out.println("Employee review: " + EmployeeReviewCalculator.calculate(dev1));

        Team team = getDummyTeam();
        System.out.println("Team Review: " + TeamReviewCalculator.calculate(team));



    }

    public static Employee getDummyEmploye(){
        Impact impact = new Impact(0.7,0.7,0.7,0.7, 0.8);
        Entity team = new Entity("NG","12");
        Score devScore = new Score(8, 3, 2, 7, 10);
        Employee employee = new Employee(new Entity("Rocky", "123123"),team,Role.Developer, 200000.0,impact, devScore);

        return employee;
    }

    public static Team getDummyTeam(){
        Impact impact = new Impact(0.7,0.7,0.7,0.7, 0.8);

        Entity team = new Entity("NG","12");
        Score devScore1 = new Score(8, 3, 2, 7, 10);
        Employee employee1 = new Employee(new Entity("Rocky", "123123"),team,Role.Developer, 200000.0,impact, devScore1);

        Score devScore2 = new Score(8, 2, 2, 8, 10);
        Employee employee2 = new Employee(new Entity("Shuvro", "1223123"),team,Role.Developer, 200000.0,impact, devScore2);

        Score devScore3 = new Score(8, 2, 3, 8, 9);
        Employee employee3 = new Employee(new Entity("Ashif", "12231212123"),team,Role.TeamLead, 200000.0,impact, devScore2);

        List<Employee>employees = new ArrayList<Employee>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);



        return new Team(team,employees);

    }

    private Project getDummyProject(){
        return null;
    }
}
