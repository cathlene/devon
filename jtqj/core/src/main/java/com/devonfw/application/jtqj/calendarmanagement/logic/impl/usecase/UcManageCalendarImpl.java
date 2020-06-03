package com.devonfw.application.jtqj.calendarmanagement.logic.impl.usecase;

import java.util.Objects;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.application.jtqj.calendarmanagement.dataaccess.api.CalendarEntity;
import com.devonfw.application.jtqj.calendarmanagement.logic.api.to.CalendarEto;
import com.devonfw.application.jtqj.calendarmanagement.logic.api.usecase.UcManageCalendar;
import com.devonfw.application.jtqj.calendarmanagement.logic.base.usecase.AbstractCalendarUc;

/**
 * Use case implementation for modifying and deleting Calendars
 */
@Named
@Validated
@Transactional
public class UcManageCalendarImpl extends AbstractCalendarUc implements UcManageCalendar {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcManageCalendarImpl.class);

  @Override
  public boolean deleteCalendar(long calendarId) {

    CalendarEntity calendar = getCalendarRepository().find(calendarId);
    getCalendarRepository().delete(calendar);
    LOG.debug("The calendar with id '{}' has been deleted.", calendarId);
    return true;
  }

  @Override
  public CalendarEto saveCalendar(CalendarEto calendar) {

    Objects.requireNonNull(calendar, "calendar");

    CalendarEntity calendarEntity = getBeanMapper().map(calendar, CalendarEntity.class);

    // initialize, validate calendarEntity here if necessary
    CalendarEntity resultEntity = getCalendarRepository().save(calendarEntity);
    LOG.debug("Calendar with id '{}' has been created.", resultEntity.getId());
    return getBeanMapper().map(resultEntity, CalendarEto.class);
  }
}
