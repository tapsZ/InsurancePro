/*package org.insurance.app.insurancepro.dto;

	import java.util.List;
	 
	import org.hibernate.SessionFactory;
import org.insurance.app.insurancepro.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;
	import org.springframework.transaction.annotation.Transactional;
	 
	 
	@Repository("EmployeeDAO")
	public class EmployeeDAOImpl implements EmployeeDAO  {
	 
	    @Autowired
	    private SessionFactory sessionFactory;
	 
	    public SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }
	 
	    public void setSessionFactory(SessionFactory sessionFactory) {
	        this.sessionFactory = sessionFactory;
	    }
	 
	    @Override
	    @Transactional
	    public String insertNewEmployee(Employee employeedetails) {
	 
	        // inserts into database & return customerId (primary_key)
	        String employeeID = (String) sessionFactory.getCurrentSession().save(employeedetails);
	        return "Employee information saved successfully with Empolyee_ID " + employeeID;
	    }
	 
	    @Override
	    @Transactional
	    public Employee getEmpolyee(String employeeID) {
	 
	        // retrieve customer based on the id supplied in the formal argument
	        Employee employeedetails = (Employee) sessionFactory.getCurrentSession().get(Employee.class, employeeID);
	        return employeedetails;
	    }
	 
	    @Override
	    @Transactional
	    public String updateEmployee(Employee employeedetails) {
	 
	        // update database with customer information and return success msg
	        sessionFactory.getCurrentSession().update(employeedetails);
	        return "Customer information updated successfully";
	    }
	 
	    @Override
	    @Transactional
	    public String deleteEmployee(Employee employeedetails) {
	 
	        // delete customer information and return success msg
	        sessionFactory.getCurrentSession().delete(employeedetails);
	        return "Customer information deleted successfully";
	    }
	 
	    @SuppressWarnings("unchecked")
	    @Override
	    @Transactional
	    public List<Employee> getAllEmployee() {
	 
	        // get all customer info from database
	        List<Employee> employeedetails = sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
	        return employeedetails ;
	    }
	}
	
	
	
}
*/