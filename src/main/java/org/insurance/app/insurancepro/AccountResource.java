package org.insurance.app.insurancepro;

import javax.ws.rs.Path;

import org.insurance.app.insurancepro.services.AccountService;

@Path("myresource")
public class AccountResource {

	AccountService accountService = new AccountService();

	// @GET
	// @Produces(MediaType.APPLICATION_XML)
	// public List<Employee> getDetails() {
	// return employeeService.getAllDetails();
}
