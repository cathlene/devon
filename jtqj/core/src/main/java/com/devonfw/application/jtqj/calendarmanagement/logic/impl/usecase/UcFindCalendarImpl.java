package com.devonfw.application.jtqj.calendarmanagement.logic.impl.usecase;

import java.util.Optional;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.application.jtqj.calendarmanagement.dataaccess.api.CalendarEntity;
import com.devonfw.application.jtqj.calendarmanagement.logic.api.to.CalendarEto;
import com.devonfw.application.jtqj.calendarmanagement.logic.api.to.CalendarSearchCriteriaTo;
import com.devonfw.application.jtqj.calendarmanagement.logic.api.usecase.UcFindCalendar;
import com.devonfw.application.jtqj.calendarmanagement.logic.base.usecase.AbstractCalendarUc;

/**
 * Use case implementation for searching, filtering and getting Calendars
 */
@Named
@Validated
@Transactional
public class UcFindCalendarImpl extends AbstractCalendarUc implements UcFindCalendar {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindCalendarImpl.class);

  @Override
  public CalendarEto findCalendar(long id) {

    LOG.debug("Get Calendar with id {} from database.", id);
    Optional<CalendarEntity> foundEntity = getCalendarRepository().findById(id);
    if (foundEntity.isPresent())
      return getBeanMapper().map(foundEntity.get(), CalendarEto.class);
    else
      return null;
  }

  @Override
  public Page<CalendarEto> findCalendars(CalendarSearchCriteriaTo criteria) {

    Page<CalendarEntity> calendars = getCalendarRepository().findByCriteria(criteria);
    return mapPaginatedEntityList(calendars, CalendarEto.class);
  }

}
