package com.umesh.budgetplanner.BudgetAPI.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umesh.budgetplanner.BudgetAPI.repository.ProjectRepository;
import com.umesh.budgetplanner.BudgetAPI.user.Project;

@RestController
public class ProjectController {
	
	private ProjectRepository projectRepository;

	public ProjectController(ProjectRepository projectRepository) {
		super();
		this.projectRepository = projectRepository;
	}
	
	@GetMapping("/project")
	public List<Project> getAllProject(){
		return projectRepository.findAll();
	}
}
