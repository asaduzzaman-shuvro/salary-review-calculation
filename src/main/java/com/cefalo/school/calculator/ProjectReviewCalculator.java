package com.cefalo.school.calculator;

import com.cefalo.school.data.Employee;
import com.cefalo.school.data.Project;
import com.cefalo.school.data.Team;

import java.util.List;

public class ProjectReviewCalculator {
    public static Double calculate(Project project){
        Double review = 0.0;
        for (Team team: project.getTeams()){
            review += TeamReviewCalculator.calculate(team);
        }
        return review;
    }
}
