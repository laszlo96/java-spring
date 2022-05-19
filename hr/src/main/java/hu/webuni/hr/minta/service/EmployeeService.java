package hu.webuni.hr.minta.service;

import java.util.List;
import java.util.Optional;

import hu.webuni.hr.minta.model.Employee;

public interface EmployeeService {
	
	public Employee save(Employee employee);
	
	public Employee update(Employee employee);
	
	public List<Employee> findAll();
	
	public Optional<Employee> findById(long id);
	
	public void delete(long id);

	int getPayRaisePercent(Employee employee);
}
