package com.cefalo.school.data;

import com.cefalo.school.calculator.Impact;
import com.cefalo.school.calculator.ReviewCalculator;
import com.cefalo.school.calculator.Score;

public class Employee implements Entity{

    private Double salary;
    private Impact impact;
    private Score score;
    private Role role = Role.Developer;

    public Employee(Double salary, Impact impact, Score score) {
        this.salary = salary;
        this.impact = impact;
        this.score = score;
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

    @Override
    public Double calculateReview() {
        ReviewCalculator calculator = new ReviewCalculator(getSalary(),getScore(), getImpact());
        return calculator.calculate();
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
