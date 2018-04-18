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

        Project project = getDummyProject();
        System.out.println("Project Review: " + ProjectReviewCalculator.calculate(project));



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

    public static Project getDummyProject(){
        Impact impact = new Impact(0.7,0.8,0.8,0.9,0.8);
        // team 1
        Entity entityTeam1 = new Entity("GB", "11");
        Score devScore11 = new Score(8, 3, 2, 7, 10);
        Employee employee11 = new Employee(new Entity("Rocky", "123123"),entityTeam1,Role.Developer, 200000.0,impact, devScore11);

        Score devScore12 = new Score(8, 2, 2, 8, 10);
        Employee employee12 = new Employee(new Entity("Shuvro", "1223123"),entityTeam1,Role.Developer, 200000.0,impact, devScore12);

        Score devScore13 = new Score(8, 2, 3, 8, 9);
        Employee employee13 = new Employee(new Entity("Ashif", "12231212123"),entityTeam1,Role.TeamLead, 200000.0,impact, devScore13);

        List<Employee> employeesTeam1 = new ArrayList<>();
        employeesTeam1.addAll(Arrays.asList(employee11,employee12,employee13));
        Team team1 = new Team(entityTeam1, employeesTeam1);

        // team 2
        Entity entityTeam2 = new Entity("NG","12");
        Score devScore21 = new Score(8, 3, 2, 7, 10);
        Employee employee21 = new Employee(new Entity("Atiqul", "223123"),entityTeam2,Role.Developer, 200000.0,impact, devScore21);

        Score devScore22 = new Score(8, 2, 2, 8, 10);
        Employee employee22 = new Employee(new Entity("Assaduzzaman", "2223123"),entityTeam2,Role.Developer, 200000.0,impact, devScore22);

        Score devScore23 = new Score(8, 2, 3, 8, 9);
        Employee employee23 = new Employee(new Entity("Iqbal", "22231212123"),entityTeam2,Role.TeamLead, 200000.0,impact, devScore23);

        List<Employee> employeesTeam2 = new ArrayList<>();
        employeesTeam2.addAll(Arrays.asList(employee21,employee22,employee23));
        Team team2 = new Team(entityTeam2, employeesTeam2);

        Entity projectEntity = new Entity("Global", "111");

        return new Project(projectEntity, Arrays.asList(team1,team2));
    }
}
