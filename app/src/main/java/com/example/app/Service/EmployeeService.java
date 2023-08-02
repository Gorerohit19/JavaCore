package com.example.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.example.app.dao.EmployeeRepository;
import com.example.app.pojos.Employee;

@Service
@Transactional
public class EmployeeService implements IEmployeeService{
	@Autowired
	private EmployeeRepository _empRepo;

	@Override
	public List<Employee> getAllEmpDetails() {
		// TODO Auto-generated method stub
		return _empRepo.findAll();
	}

	@Override
	public Employee getEmpDetails(int empId) {
		// TODO Auto-generated method stub
		return _empRepo.findById(empId)
		.orElseThrow(()-> new ResourceNotFoundException("Invalid Employee Id....."+ empId));
	}

	@Override
	public Employee saveEmpDetails(Employee theEmployee) {
		// TODO Auto-generated method stub
		return _empRepo.save(theEmployee);
	}

	@Override
	public boolean deleteEmpDetails(int empId) {
		// TODO Auto-generated method stub
		boolean status = false;
		if(_empRepo.existsById(empId))
		{
			_empRepo.deleteById(empId);
			status = true;
		}
		return status;
	}

	@Override
	public Employee updateEmpDetails(Employee theEmployee) {
		// TODO Auto-generated method stub
		return _empRepo.save(theEmployee);
	}
	
    
}
