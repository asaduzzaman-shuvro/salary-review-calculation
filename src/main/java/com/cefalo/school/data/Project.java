package com.cefalo.school.data;

import java.util.List;

public class Project implements Entity{
    private Employee projectManager;

    private List<Team> teams;
    private String name;

    public Project(List<Team> teams, String name) {
        this.teams = teams;
        this.name = name;
    }

    public boolean addTeam(Team team) {
        this.teams.add(team);
        return  true;
    }

    public boolean removeTeam(Team team){
        this.teams.remove(team);
        return  true;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public Employee getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(Employee projectManager) {
        this.projectManager = projectManager;
        this.projectManager.setRole(Role.ProjectManager);
    }

    @Override
    public Double calculateReview() {
        Double review = 0.0;
        for(Team team : teams){
            review += team.calculateReview();
        }
        return review;
    }

    @Override
    public void printInformation() {
        System.out.println("Project Name: "+name+ " ReviewedSalary: "+calculateReview());
        if(projectManager != null){
            System.out.println("PM: "+projectManager.getName());
//            projectManager.printInformation();
        }
        for(Team team: teams){
            team.printInformation();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
