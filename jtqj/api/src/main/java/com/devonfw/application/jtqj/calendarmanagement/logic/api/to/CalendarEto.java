package com.devonfw.application.jtqj.calendarmanagement.logic.api.to;

import com.devonfw.application.jtqj.calendarmanagement.common.api.Calendar;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of Calendar
 */
public class CalendarEto extends AbstractEto implements Calendar {

  private static final long serialVersionUID = 1L;

  private String name;

  private Integer _year;

  private Integer _month;

  private Integer days_number;

  private Integer yearmonth;

  private Long centerId;

  @Override
  public String getName() {

    return name;
  }

  @Override
  public void setName(String name) {

    this.name = name;
  }

  @Override
  public Integer get_year() {

    return _year;
  }

  @Override
  public void set_year(Integer _year) {

    this._year = _year;
  }

  @Override
  public Integer get_month() {

    return _month;
  }

  @Override
  public void set_month(Integer _month) {

    this._month = _month;
  }

  @Override
  public Integer getDays_number() {

    return days_number;
  }

  @Override
  public void setDays_number(Integer days_number) {

    this.days_number = days_number;
  }

  @Override
  public Integer getYearmonth() {

    return yearmonth;
  }

  @Override
  public void setYearmonth(Integer yearmonth) {

    this.yearmonth = yearmonth;
  }

  @Override
  public Long getCenterId() {

    return centerId;
  }

  @Override
  public void setCenterId(Long centerId) {

    this.centerId = centerId;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
    result = prime * result + ((this._year == null) ? 0 : this._year.hashCode());
    result = prime * result + ((this._month == null) ? 0 : this._month.hashCode());
    result = prime * result + ((this.days_number == null) ? 0 : this.days_number.hashCode());
    result = prime * result + ((this.yearmonth == null) ? 0 : this.yearmonth.hashCode());

    result = prime * result + ((this.centerId == null) ? 0 : this.centerId.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    // class check will be done by super type EntityTo!
    if (!super.equals(obj)) {
      return false;
    }
    CalendarEto other = (CalendarEto) obj;
    if (this.name == null) {
      if (other.name != null) {
        return false;
      }
    } else if (!this.name.equals(other.name)) {
      return false;
    }
    if (this._year == null) {
      if (other._year != null) {
        return false;
      }
    } else if (!this._year.equals(other._year)) {
      return false;
    }
    if (this._month == null) {
      if (other._month != null) {
        return false;
      }
    } else if (!this._month.equals(other._month)) {
      return false;
    }
    if (this.days_number == null) {
      if (other.days_number != null) {
        return false;
      }
    } else if (!this.days_number.equals(other.days_number)) {
      return false;
    }
    if (this.yearmonth == null) {
      if (other.yearmonth != null) {
        return false;
      }
    } else if (!this.yearmonth.equals(other.yearmonth)) {
      return false;
    }

    if (this.centerId == null) {
      if (other.centerId != null) {
        return false;
      }
    } else if (!this.centerId.equals(other.centerId)) {
      return false;
    }
    return true;
  }
}
