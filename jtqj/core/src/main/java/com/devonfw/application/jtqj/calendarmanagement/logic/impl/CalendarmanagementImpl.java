package com.devonfw.application.jtqj.calendarmanagement.logic.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.jtqj.calendarmanagement.logic.api.Calendarmanagement;
import com.devonfw.application.jtqj.calendarmanagement.logic.api.to.CalendarEto;
import com.devonfw.application.jtqj.calendarmanagement.logic.api.to.CalendarSearchCriteriaTo;
import com.devonfw.application.jtqj.calendarmanagement.logic.api.usecase.UcFindCalendar;
import com.devonfw.application.jtqj.calendarmanagement.logic.api.usecase.UcManageCalendar;
import com.devonfw.application.jtqj.general.logic.base.AbstractComponentFacade;

/**
 * Implementation of component interface of calendarmanagement
 */
@Named
public class CalendarmanagementImpl extends AbstractComponentFacade implements Calendarmanagement {

  @Inject
  private UcFindCalendar ucFindCalendar;

  @Inject
  private UcManageCalendar ucManageCalendar;

  @Override
  public CalendarEto findCalendar(long id) {

    return this.ucFindCalendar.findCalendar(id);
  }

  @Override
  public Page<CalendarEto> findCalendars(CalendarSearchCriteriaTo criteria) {

    return this.ucFindCalendar.findCalendars(criteria);
  }

  @Override
  public CalendarEto saveCalendar(CalendarEto calendar) {

    return this.ucManageCalendar.saveCalendar(calendar);
  }

  @Override
  public boolean deleteCalendar(long id) {

    return this.ucManageCalendar.deleteCalendar(id);
  }
}
