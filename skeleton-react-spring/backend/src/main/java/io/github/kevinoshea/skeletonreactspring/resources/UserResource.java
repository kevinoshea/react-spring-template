package io.github.kevinoshea.skeletonreactspring.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.github.kevinoshea.skeletonreactspring.model.User;
import io.github.kevinoshea.skeletonreactspring.util.LoggedInUserUtil;

@Path("/user")
public class UserResource {

	@GET
	@Path("/loggedin")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getLoggedInUser() {
		final User user = LoggedInUserUtil.getLoggedInUser();
		if (user == null) {
			return Response.noContent().build();
		}
		return Response.ok(user).build();
	}
}
