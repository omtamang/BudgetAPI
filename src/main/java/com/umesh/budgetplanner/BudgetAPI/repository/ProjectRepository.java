package com.umesh.budgetplanner.BudgetAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.umesh.budgetplanner.BudgetAPI.user.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer>{

}
