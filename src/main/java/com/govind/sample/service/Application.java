package com.govind.sample.service;

import com.govind.sample.payload.User;
import com.govind.sample.util.JsonMapping;
import com.govind.sample.util.ToJson;
import org.springframework.util.MimeType;
import org.springframework.web.bind.annotation.PathVariable;

import javax.ws.rs.*;

/**
 * Created by 609600403 on 10/03/2016.
 */

@Path("/")
public interface Application {
    @Path("name/{id}")
    @GET
    @ToJson
    @Produces("application/json")
    User getUser(@PathParam("id") int id);
}
