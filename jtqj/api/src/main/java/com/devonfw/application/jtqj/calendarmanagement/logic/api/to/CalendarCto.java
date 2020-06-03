package com.devonfw.application.jtqj.calendarmanagement.logic.api.to;

import com.devonfw.application.jtqj.centermanagement.logic.api.to.CenterEto;
import com.devonfw.module.basic.common.api.to.AbstractCto;

/**
 * Composite transport object of Calendar
 */
public class CalendarCto extends AbstractCto {

  private static final long serialVersionUID = 1L;

  private CalendarEto calendar;

  private CenterEto center;

  public CalendarEto getCalendar() {

    return calendar;
  }

  public void setCalendar(CalendarEto calendar) {

    this.calendar = calendar;
  }

  public CenterEto getCenter() {

    return center;
  }

  public void setCenter(CenterEto center) {

    this.center = center;
  }

}
