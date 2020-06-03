package com.devonfw.application.jtqj.calendarmanagement.logic.base.usecase;

import javax.inject.Inject;

import com.devonfw.application.jtqj.calendarmanagement.dataaccess.api.repo.CalendarRepository;
import com.devonfw.application.jtqj.general.logic.base.AbstractUc;

/**
 * Abstract use case for Calendars, which provides access to the commonly necessary data access objects.
 */
public class AbstractCalendarUc extends AbstractUc {

  /** @see #getCalendarRepository() */
  @Inject
  private CalendarRepository calendarRepository;

  /**
   * Returns the field 'calendarRepository'.
   * 
   * @return the {@link CalendarRepository} instance.
   */
  public CalendarRepository getCalendarRepository() {

    return this.calendarRepository;
  }

}
