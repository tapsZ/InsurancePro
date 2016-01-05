package org.insurance.app.insurancepro.dto;

import java.util.List;

import org.insurance.app.insurancepro.model.Employee;
	 
	
	public interface EmployeeDAO {
	 
	    public String insertNewEmployee(Employee employeedetails);
	    public Employee getEmpolyee(String employeeID);
	    public String updateEmployee(Employee employeedetails);
	    public String deleteEmployee(Employee employeedetails);
	    public List<Employee> getAllEmployee();
	}
