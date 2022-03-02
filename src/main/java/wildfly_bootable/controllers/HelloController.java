package wildfly_bootable.controllers;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import wildfly_bootable.models.HelloModel;

@Path("/hello")
public class HelloController {
	
	@GET
	@Produces("application/json")
	public Response getHello() {
		return Response.ok(new HelloModel("Hello from WildFly Bootable Jar!")).build();
	}

}
