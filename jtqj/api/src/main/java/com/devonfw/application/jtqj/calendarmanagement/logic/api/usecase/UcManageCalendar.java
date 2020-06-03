package com.devonfw.application.jtqj.calendarmanagement.logic.api.usecase;

import com.devonfw.application.jtqj.calendarmanagement.logic.api.to.CalendarEto;

/**
 * Interface of UcManageCalendar to centralize documentation and signatures of methods.
 */
public interface UcManageCalendar {

  /**
   * Deletes a calendar from the database by its id 'calendarId'.
   *
   * @param calendarId Id of the calendar to delete
   * @return boolean <code>true</code> if the calendar can be deleted, <code>false</code> otherwise
   */
  boolean deleteCalendar(long calendarId);

  /**
   * Saves a calendar and store it in the database.
   *
   * @param calendar the {@link CalendarEto} to create.
   * @return the new {@link CalendarEto} that has been saved with ID and version.
   */
  CalendarEto saveCalendar(CalendarEto calendar);

}
