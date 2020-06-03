package com.devonfw.application.jtqj.calendarmanagement.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.data.domain.Page;

import com.devonfw.application.jtqj.calendarmanagement.logic.api.Calendarmanagement;
import com.devonfw.application.jtqj.calendarmanagement.logic.api.to.CalendarEto;
import com.devonfw.application.jtqj.calendarmanagement.logic.api.to.CalendarSearchCriteriaTo;

/**
 * The service interface for REST calls in order to execute the logic of component {@link Calendarmanagement}.
 */
@Path("/calendarmanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface CalendarmanagementRestService {

  /**
   * Delegates to {@link Calendarmanagement#findCalendar}.
   *
   * @param id the ID of the {@link CalendarEto}
   * @return the {@link CalendarEto}
   */
  @GET
  @Path("/calendar/{id}/")
  public CalendarEto getCalendar(@PathParam("id") long id);

  /**
   * Delegates to {@link Calendarmanagement#saveCalendar}.
   *
   * @param calendar the {@link CalendarEto} to be saved
   * @return the recently created {@link CalendarEto}
   */
  @POST
  @Path("/calendar/")
  public CalendarEto saveCalendar(CalendarEto calendar);

  /**
   * Delegates to {@link Calendarmanagement#deleteCalendar}.
   *
   * @param id ID of the {@link CalendarEto} to be deleted
   */
  @DELETE
  @Path("/calendar/{id}/")
  public void deleteCalendar(@PathParam("id") long id);

  /**
   * Delegates to {@link Calendarmanagement#findCalendarEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding calendars.
   * @return the {@link Page list} of matching {@link CalendarEto}s.
   */
  @Path("/calendar/search")
  @POST
  public Page<CalendarEto> findCalendars(CalendarSearchCriteriaTo searchCriteriaTo);

}