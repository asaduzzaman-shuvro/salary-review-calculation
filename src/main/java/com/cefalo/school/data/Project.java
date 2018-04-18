package com.cefalo.school.data;

import java.util.List;

public class Project implements Entity{
    private Employee projectManager;

    private List<Team> teams;

    public Project(List<Team> teams) {
        this.teams = teams;
    }

    public boolean addTeam(Team team) {
        return  false;
    }

    public boolean removeTeam(Team team){
        return  false;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public Employee getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(Employee projectManager) {
        this.projectManager = projectManager;
    }

    @Override
    public Double calculateReview() {
        Double review = 0.0;
        for(Team team : teams){
            review += team.calculateReview();
        }
        return review;
    }
}
