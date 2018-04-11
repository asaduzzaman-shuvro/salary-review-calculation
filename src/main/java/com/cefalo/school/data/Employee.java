package com.cefalo.school.data;

import com.cefalo.school.calculator.Impact;
import com.cefalo.school.calculator.Score;

public class Employee {
    private Entity teamEntity;
    private Entity entity;
    private Role role;
    private Double salary;
    private Impact impact;
    private Score score;

    public Employee(Entity entity, Entity teamEntity, Role role, Double salary, Impact impact, Score score) {
        this.entity = entity;
        this.role = role;
        this.salary = salary;
        this.teamEntity = teamEntity;
        this.impact = impact;
        this.score = score;
    }


    public Entity getTeamEntity() {
        return teamEntity;
    }

    public Entity getEntity() {
        return entity;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Impact getImpact() {
        return impact;
    }

    public void setImpact(Impact impact) {
        this.impact = impact;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }
}
