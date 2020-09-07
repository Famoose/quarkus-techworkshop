package ch.puzzle.job;

import ch.puzzle.boundry.DataJokeService;
import ch.puzzle.entity.Joke;
import ch.puzzle.socket.JokeSocket;
import io.quarkus.scheduler.Scheduled;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class JokeJob {

    @RestClient
    DataJokeService dataJokeService;

    @Inject
    JokeSocket jokeSocket;

    @Scheduled(every="10s")
    public void updateJoke(){
        Joke joke = dataJokeService.getJoke("Chuck", "Noris");
        jokeSocket.onMessage(joke.getValue().getJoke());
    }
}
