package odelia.restclient;

import javax.json.JsonObject;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@RegisterRestClient  
@Produces(MediaType.APPLICATION_JSON)
public interface SwapiService {  
    @GET  
    @Path("/people/{id}")  
    JsonObject getCharacter(@PathParam("id") String id);  
  
    @GET  
    @Path("/people")  
    JsonObject getPeople();  
}
