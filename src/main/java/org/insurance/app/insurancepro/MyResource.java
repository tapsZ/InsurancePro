package org.insurance.app.insurancepro;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.insurance.app.insurancepro.model.Employee;
import org.insurance.app.insurancepro.services.EmployeeService;

@Path("myresource")
public class MyResource {

    //EmployeeService employeeService=new EmployeeService();
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public ArrayList<Employee> getDetails() {
    	System.out.println("Getting all Employees...");
    	ArrayList<Employee> employeeList=new ArrayList<Employee>();
    	return employeeList;
    	
}}
