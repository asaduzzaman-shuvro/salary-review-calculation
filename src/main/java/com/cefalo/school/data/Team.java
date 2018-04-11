package com.cefalo.school.data;

import java.util.List;

public class Team {
    private Entity entity;
    private Employee teamLead;
    private List<Employee> employees;

    public Team(Entity entity, List<Employee> employees) {
        this.entity = entity;
        this.employees = employees;
    }

    public Entity getEntity() {
        return entity;
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
}
