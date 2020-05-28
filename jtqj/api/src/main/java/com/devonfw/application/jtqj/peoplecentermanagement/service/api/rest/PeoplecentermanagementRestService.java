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

import com.devonfw.application.jtqj.peoplecentermanagement.common.api.CompositePeopleCenterKey;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.Peoplecentermanagement;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeoplecenterCto;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeoplecenterEto;
import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeoplecenterSearchCriteriaTo;

/**
 * The service interface for REST calls in order to execute the logic of component {@link Peoplecentermanagement}.
 */
@Path("/peoplecentermanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface PeoplecentermanagementRestService {

  /**
   * Delegates to {@link Peoplecentermanagement#findPeoplecenter}.
   *
   * @param id the ID of the {@link PeoplecenterEto}
   * @return the {@link PeoplecenterEto}
   */
  @GET
  @Path("/peoplecenter/{id}/")
  public PeoplecenterEto getPeoplecenter(@PathParam("id") CompositePeopleCenterKey id);

  /**
   * Delegates to {@link Peoplecentermanagement#savePeoplecenter}.
   *
   * @param peoplecenter the {@link PeoplecenterEto} to be saved
   * @return the recently created {@link PeoplecenterEto}
   */
  @POST
  @Path("/peoplecenter/")
  public PeoplecenterEto savePeoplecenter(PeoplecenterEto peoplecenter);

  /**
   * Delegates to {@link Peoplecentermanagement#deletePeoplecenter}.
   *
   * @param id ID of the {@link PeoplecenterEto} to be deleted
   */
  @DELETE
  @Path("/peoplecenter/{id}/")
  public void deletePeoplecenter(@PathParam("id") CompositePeopleCenterKey id);

  /**
   * Delegates to {@link Peoplecentermanagement#findPeoplecenterEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding peoplecenters.
   * @return the {@link Page list} of matching {@link PeoplecenterEto}s.
   */
  @Path("/peoplecenter/search")
  @POST
  public Page<PeoplecenterEto> findPeoplecenters(PeoplecenterSearchCriteriaTo searchCriteriaTo);

  /**
   * Delegates to {@link Employeemanagement#findEmployeeCto}.
   *
   * @param id the ID of the {@link EmployeeCto}
   * @return the {@link EmployeeCto}
   */
  @GET
  @Path("/peoplecenter/cto/{id}/")
  public PeoplecenterCto getPeoplecenterCto(@PathParam("id") CompositePeopleCenterKey id);

  /**
   * Delegates to {@link Employeemanagement#findEmployeeCtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding employees.
   * @return the {@link Page list} of matching {@link EmployeeCto}s.
   */
  @Path("/peoplecenter/cto/search")
  @POST
  public Page<PeoplecenterCto> getPeoplecenterCto(PeoplecenterSearchCriteriaTo searchCriteriaTo);

  @Path("/peoplecenter/cto")
  @POST
  public PeoplecenterCto savePeoplecenter(PeoplecenterCto peopleCenter);

}