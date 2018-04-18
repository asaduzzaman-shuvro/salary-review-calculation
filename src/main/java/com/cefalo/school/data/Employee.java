package com.cefalo.school.data;

import com.cefalo.school.calculator.Impact;
import com.cefalo.school.calculator.ReviewCalculator;
import com.cefalo.school.calculator.Score;

public class Employee implements Entity{

    private String name;
    private Double salary;
    private Impact impact;
    private Score score;
    private Role role = Role.Developer;

    public Employee(Double salary, Impact impact, Score score, String name) {
        this.salary = salary;
        this.impact = impact;
        this.score = score;
        this.name = name;
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

    @Override
    public void printInformation() {
        System.out.println("Employe Name: "+name+ " ReviewdSalary: "+calculateReview());
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
