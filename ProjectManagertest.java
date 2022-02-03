
package com.TimeSheet.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import com.TimeSheet.EmployeeModel.ProjectManager;
import com.TimeSheet.EmployeeRepository.ProjectManagerRepository;
import com.TimeSheet.EmployeeService.ProjectManagerService;

@RunWith(SpringRunner.class)

@SpringBootTest public class ProjectManagertest {

@Autowired 
private ProjectManagerService service;

@MockBean 
private ProjectManagerRepository repository;

@Test 
public void getProjectAddTest() {
when(repository.findAll()).thenReturn( Stream.of (new ProjectManager(29,
"timesheet","SAS", "timesheet system", "anju k", "anju@gmail.com", "mac", "mac", "mac", "rahul k",
"sanjay", "timesheet employee", "complete"), new ProjectManager(29, "timesheet","SAS", "timesheet system",
"anju k", "anju@gmail,com", "mac", "mac", "mac","rahul k", "sanjay", "timesheet employee", "complete"))
.collect(Collectors.toList()));
assertEquals(2,service.findAllProject().size()); }


@Test 
public void saveUser()
{ 
 ProjectManager pm=new ProjectManager(29,
 "timesheet","SAS", "timesheet system", "anju k",       "anju@gmail.com", "mac", "mac", "mac", "rahul k",
"sanjay", "timesheet employee", "complete"); when(repository.save(pm)).thenReturn(pm);
assertEquals(pm,service.addProject(pm));
 }


}

