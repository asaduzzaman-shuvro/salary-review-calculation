package com.cefalo.school.data;

import java.util.List;

public class Project {
    private Employee projectManager;
    private Entity entity;
    private List<Team> teams;

    public Project(Entity entity, List<Team> teams) {
        this.entity = entity;
        this.teams = teams;
    }

    public boolean addTeam(Team team) {
        return  false;
    }

    public boolean removeTeam(Team team){
        return  false;
    }


    public Entity getEntity() {
        return entity;
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
}
