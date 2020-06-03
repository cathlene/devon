package com.devonfw.application.jtqj.calendarmanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.devonfw.application.jtqj.calendarmanagement.logic.api.to.CalendarEto;
import com.devonfw.application.jtqj.calendarmanagement.logic.api.to.CalendarSearchCriteriaTo;

public interface UcFindCalendar {

  /**
   * Returns a Calendar by its id 'id'.
   *
   * @param id The id 'id' of the Calendar.
   * @return The {@link CalendarEto} with id 'id'
   */
  CalendarEto findCalendar(long id);

  /**
   * Returns a paginated list of Calendars matching the search criteria.
   *
   * @param criteria the {@link CalendarSearchCriteriaTo}.
   * @return the {@link List} of matching {@link CalendarEto}s.
   */
  Page<CalendarEto> findCalendars(CalendarSearchCriteriaTo criteria);

}
