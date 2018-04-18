package com.cefalo.school.data;

import java.util.List;

public class Team implements Entity{
    private Employee teamLead;
    private List<Employee> employees;
    private String name;

    public Team(List<Employee> employees, String name) {
        this.employees = employees;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public boolean addMember(Employee employee) {

        this.employees.add(employee);
        return  true;
    }

    public boolean removeMember(Employee employee) {
        this.employees.remove(employee);
        return true;
    }

    public Employee getTeamLead() {
        return teamLead;
    }

    public void setTeamLead(Employee teamLead) {
        this.teamLead = teamLead;
        this.teamLead.setRole(Role.TeamLead);
    }



    @Override
    public Double calculateReview() {
        Double review = 0.0;
        for(Employee employee : employees){
            review += employee.calculateReview();
        }
        return review;
    }


    @Override
    public void printInformation() {
        System.out.println("Team Name: "+name+ " ReviewedSalary: "+calculateReview());
        if (teamLead != null){
            System.out.println("TeamLead: "+ teamLead.getName());
//            teamLead.printInformation();
        }
        for(Employee employee : employees){
            employee.printInformation();
        }
    }


}
