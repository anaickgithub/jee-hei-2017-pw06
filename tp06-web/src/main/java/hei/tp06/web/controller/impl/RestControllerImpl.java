package hei.tp06.web.controller.impl;

import hei.tp06.entity.Evenement;
import hei.tp06.service.EvenementService;
import hei.tp06.web.controller.RestController;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by Anaïck on 14/02/2017.
 */
@Named
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RestControllerImpl implements RestController {

    @Inject
    private EvenementService evenemenentService;

    @GET
    @Path("/evenements")
    public List<Evenement> listEvenements()
    {
        return evenemenentService.findAll();
    }

    @GET
    @Path("/evenements/{idevenement}")
    public Evenement getEvenement(@PathParam("idevenement") Long id) {
        return evenemenentService.findOneById(id);
    }

}
