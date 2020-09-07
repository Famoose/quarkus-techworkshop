package ch.puzzle.boundry;

import ch.puzzle.entity.Joke;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

// http://api.icndb.com/jokes/random?firstName=Marc&amp&lastName=

@Path("/jokes")
@RegisterRestClient(configKey = "data-joke-api")
public interface DataJokeService {

    @GET
    @Path("/random")
    @Produces("application/json")
    Joke getJoke(@QueryParam("firstName") String firstName, @QueryParam("lastName") String lastName);
}
