package jee.hello.world;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author rirfanuddin
 * The REST source implementation class, called as controller
 */
@Path("/")
public class Controller {

    @GET
    @Path("object")
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, String> object(){
        Map<String, String> data = Collections.singletonMap("key", "hello world");
        return data;
    }

    @GET
    @Path("list")
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> list(){
        List<String> data = Arrays.asList("hello", "world", "irfan");
        return data;
    }

}
