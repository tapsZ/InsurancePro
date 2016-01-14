/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insurance.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user1
 */

@Entity
@Table(name = "REQUEST")
@NamedNativeQuery(name = "Request.all", query = "select * from REQUEST", resultClass = Request.class)
//@NamedQuery(name = "Request.byRequestNo", query = "from Request where requestNo=?")
@XmlRootElement(name = "policyholder")
public class Request {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int requestNo;
	private String productType;
	@Temporal(TemporalType.DATE)
	private Date date;
	private String comment;
	private String status;
	
	@XmlElement
	public int getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(int requestNo) {
		this.requestNo = requestNo;
	}
	
	@XmlElement
	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	@XmlElement
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@XmlElement
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@XmlElement
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@ManyToOne
	private Underwritter underwritter;

	public Underwritter getUnderwritter() {
		return underwritter;
	}

	public void setUnderwritter(Underwritter underwritter) {
		this.underwritter = underwritter;
	}

	@ManyToOne
	private PolicyHolder policyholder;

	public PolicyHolder getPolicyholder() {
		return policyholder;
	}

	public void setPolicyholder(PolicyHolder policyholder) {
		this.policyholder = policyholder;
	}

	public Request() {
		
	}

}
