package wildfly_bootable.controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import wildfly_bootable.models.MessageModel;
import wildfly_bootable.repositories.MessageRepository;

@Path("/messages")
@Produces("application/json")
@Consumes("application/json")
public class MessageController {
	
	@Inject
	private MessageRepository messageRepository;
	
	@GET
	public Response selectAllMessages() {
		return Response.ok(messageRepository.selectAllMessages()).build();
	}

	@POST
	public Response insertMessage(MessageModel message) {
		messageRepository.insertMessage(message);
		return Response.ok().build();
	}

}
