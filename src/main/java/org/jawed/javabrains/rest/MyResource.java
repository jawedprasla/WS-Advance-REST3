package org.jawed.javabrains.rest;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("{pathParam}/test")
//@Singleton   - We cannot use singleton annotation here because singleton resource get initialize during deployment
//				so you cannot provide variable value. Where as in default type resource get initialize when it is called.
public class MyResource {

	@PathParam("pathParam") private String pathParamExample;
	@QueryParam("query") private String queryParamExample;
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod(){
		return "It works! Path Param used " + pathParamExample + " and Query param used " + queryParamExample;
	}
}
