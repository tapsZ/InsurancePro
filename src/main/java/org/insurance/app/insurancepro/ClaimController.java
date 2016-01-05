package org.insurance.app.insurancepro;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.insurance.app.insurancepro.model.Claim;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Path("claim")
public class ClaimController {
@RequestMapping("claim")
//@GET
//@Produces(MediaType.APPLICATION_XML)
    public ArrayList<Claim> getClaims()
{
    	System.out.println("Getting all Claims...");
    	ArrayList<Claim> claimList=new ArrayList<Claim>();
       	return claimList;
    }
}