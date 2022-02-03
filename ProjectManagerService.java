package com.TimeSheet.EmployeeService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TimeSheet.EmployeeModel.ProjectManager;
import com.TimeSheet.EmployeeRepository.ProjectManagerRepository;

@Service
public class ProjectManagerService implements IProjectManagerService {

		@Autowired
		ProjectManagerRepository repo;

		@Override
		public ProjectManager addProject(ProjectManager projectManager) {
			
			ProjectManager pm = repo.save(projectManager);
			
			return pm;
		}
	
		public List<ProjectManager> findAllProject() {
		
			return repo.findAll();
		}
		@Override
		public Optional<ProjectManager> findByProjectId(int proj_id) {
		
			return repo.findById(proj_id);
		}

		public void delete(ProjectManager project) {
		
			repo.delete(project);
			
		}
}
