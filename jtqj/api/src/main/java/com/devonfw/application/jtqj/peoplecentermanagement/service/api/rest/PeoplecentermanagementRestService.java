package com.devonfw.application.jtqj.peoplecentermanagement.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.data.domain.Page;

import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.Peoplecentermanagement;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeopleCenterEto;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeopleCenterSearchCriteriaTo;

/**
 * The service interface for REST calls in order to execute the logic of component {@link Peoplecentermanagement}.
 */
@Path("/peoplecentermanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface PeoplecentermanagementRestService {

  /**
   * Delegates to {@link Peoplecentermanagement#findPeopleCenter}.
   *
   * @param id the ID of the {@link PeopleCenterEto}
   * @return the {@link PeopleCenterEto}
   */
  @GET
  @Path("/peoplecenter/{id}/")
  public PeopleCenterEto getPeopleCenter(@PathParam("id") long id);

  /**
   * Delegates to {@link Peoplecentermanagement#savePeopleCenter}.
   *
   * @param peoplecenter the {@link PeopleCenterEto} to be saved
   * @return the recently created {@link PeopleCenterEto}
   */
  @POST
  @Path("/peoplecenter/")
  public PeopleCenterEto savePeopleCenter(PeopleCenterEto peoplecenter);

  /**
   * Delegates to {@link Peoplecentermanagement#deletePeopleCenter}.
   *
   * @param id ID of the {@link PeopleCenterEto} to be deleted
   */
  @DELETE
  @Path("/peoplecenter/{id}/")
  public void deletePeopleCenter(@PathParam("id") long id);

  /**
   * Delegates to {@link Peoplecentermanagement#findPeopleCenterEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding peoplecenters.
   * @return the {@link Page list} of matching {@link PeopleCenterEto}s.
   */
  @Path("/peoplecenter/search")
  @POST
  public Page<PeopleCenterEto> findPeopleCenters(PeopleCenterSearchCriteriaTo searchCriteriaTo);

}
