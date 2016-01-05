package org.insurance.app.insurancepro;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.insurance.app.insurancepro.dto.Hibernate;
import org.insurance.app.insurancepro.model.Request;
import org.insurance.app.insurancepro.services.RequestService;

@Path("requests")
public class RequestResource {

	RequestService requestService = new RequestService();

	@Path("/add")
	@POST
	@Consumes({ MediaType.TEXT_PLAIN })
	@Produces({ MediaType.TEXT_PLAIN})
	public void addRequest(Request request) {
		System.out.println("Adding your Request");

		if (request != null) {
			System.out.println("Request successfully submited" + request.toString());
			SessionFactory factory1 = Hibernate.getSessionFactory();
			Session session1 = factory1.openSession();
			session1.beginTransaction();
			session1.save(request);
			session1.getTransaction().commit();
			session1.close();

		} else {
			System.out.println("Unable to add actors...");
		}

	}

	@GET
	@Produces({ MediaType.TEXT_PLAIN })
	public List<Request> getRequests() {

		SessionFactory factory1 = Hibernate.getSessionFactory();
		Session session1 = factory1.openSession();
		session1.beginTransaction();
		Query query = session1.getNamedQuery("Request.all");
		List<Request> requests = (List<Request>) query.list();
		session1.getTransaction().commit();
		session1.close();
		return requests;

	}
}
