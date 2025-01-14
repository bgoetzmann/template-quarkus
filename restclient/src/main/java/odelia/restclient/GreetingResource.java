package odelia.restclient;

import javax.inject.Inject;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/hello")
public class GreetingResource {

    @Inject  
    @RestClient  
    SwapiService swapiService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        JsonObject character = swapiService.getCharacter("1");
        return character.getString("name");
    }
}