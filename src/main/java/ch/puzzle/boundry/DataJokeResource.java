package ch.puzzle.boundry;

import ch.puzzle.entity.Joke;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/joke")
public class DataJokeResource {

    @RestClient
    DataJokeService dataJokeService;

    @GET()
    @Path("/random")
    @Produces(MediaType.APPLICATION_JSON)
    public Joke getData() {
        return dataJokeService.getJoke("Noemi", "Test");
    }
}
