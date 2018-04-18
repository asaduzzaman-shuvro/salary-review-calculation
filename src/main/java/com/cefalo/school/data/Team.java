package com.cefalo.school.data;

import java.util.List;

public class Team implements Entity{
    private Employee teamLead;
    private List<Employee> employees;

    public Team(List<Employee> employees) {
        this.employees = employees;

    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public boolean addMember(Employee employee) {

        return  false;
    }

    public boolean removeMember(Employee employee) {
        return  false;
    }

    public Employee getTeamLead() {
        return teamLead;
    }

    public void setTeamLead(Employee teamLead) {
        this.teamLead = teamLead;
    }

    @Override
    public Double calculateReview() {
        Double review = 0.0;
        for(Employee employee : employees){
            review += employee.calculateReview();
        }
        return review;
    }
}
