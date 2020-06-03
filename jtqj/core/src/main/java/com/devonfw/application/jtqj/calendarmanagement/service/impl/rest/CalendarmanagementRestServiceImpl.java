package com.devonfw.application.jtqj.calendarmanagement.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.jtqj.calendarmanagement.logic.api.Calendarmanagement;
import com.devonfw.application.jtqj.calendarmanagement.logic.api.to.CalendarEto;
import com.devonfw.application.jtqj.calendarmanagement.logic.api.to.CalendarSearchCriteriaTo;
import com.devonfw.application.jtqj.calendarmanagement.service.api.rest.CalendarmanagementRestService;

/**
 * The service implementation for REST calls in order to execute the logic of component {@link Calendarmanagement}.
 */
@Named("CalendarmanagementRestService")
public class CalendarmanagementRestServiceImpl implements CalendarmanagementRestService {

  @Inject
  private Calendarmanagement calendarmanagement;

  @Override
  public CalendarEto getCalendar(long id) {

    return this.calendarmanagement.findCalendar(id);
  }

  @Override
  public CalendarEto saveCalendar(CalendarEto calendar) {

    return this.calendarmanagement.saveCalendar(calendar);
  }

  @Override
  public void deleteCalendar(long id) {

    this.calendarmanagement.deleteCalendar(id);
  }

  @Override
  public Page<CalendarEto> findCalendars(CalendarSearchCriteriaTo searchCriteriaTo) {

    return this.calendarmanagement.findCalendars(searchCriteriaTo);
  }
}