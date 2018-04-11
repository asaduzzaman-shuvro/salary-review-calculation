package com.cefalo.school.calculator;

import com.cefalo.school.data.Employee;
import com.cefalo.school.data.Team;

import java.util.List;

public class ProjectReviewCalculator {
    static Double calculate(List<Team> teams){
        Double review = 0.0;
        for (Team team: teams){
            review += TeamReviewCalculator.calculate(team);
        }
        return review;
    }
}
