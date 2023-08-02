package com.example.app.Service;

import java.util.List;
import com.example.app.pojos.Employee;

public interface IEmployeeService {
    //get all emps
	List<Employee> getAllEmpDetails();
	//save new emp details
	Employee saveEmpDetails(Employee transientEmp);
	//delete emp details
	boolean deleteEmpDetails(int empId);
	//get emp details by specified id
	Employee getEmpDetails(int empId);
	//update existing emp details
	Employee  updateEmpDetails(Employee updatedDetachedEmp);
}
