package org.insurance.app.insurancepro.services;

import java.util.ArrayList;
import java.util.List;

import org.insurance.app.insurancepro.model.Employee;

public class EmployeeService {
	public List<Employee> getAllDetails(){
		Employee e1= new Employee(8, "Patie", "Chikomba","4645");
		Employee e2= new Employee(5, "Patience", "Chikomba","4645");
		List<Employee> list= new ArrayList<>();
		list.add(e1);
		list.add(e2);
		return list;
	}

}
