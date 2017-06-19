package com.jerem.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * The Interface BSCarLoanSubscription.<br/>
 * BRED - Banque populaire
 * @author BredBanquePopulaire
 */
@Consumes({ javax.ws.rs.core.MediaType.APPLICATION_JSON })
@Path("/")
@Produces({ javax.ws.rs.core.MediaType.APPLICATION_JSON })
@Api(value = "BSCarLoanSubscription", produces = "application/json")
public interface BSCarLoanSubscription {

    @GET
    @Path("/find/{name}")
    @ApiOperation(value = "find", response = Boolean.class)
    @ApiResponses(value = { @ApiResponse(code = 200, message = "find OK"), @ApiResponse(code = 404, message = "find KO") })
    Boolean find(@PathParam("name") String name);

}
