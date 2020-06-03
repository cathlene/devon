package com.devonfw.application.jtqj.calendarmanagement.logic.api.to;

import com.devonfw.application.jtqj.general.common.api.to.AbstractSearchCriteriaTo;
import com.devonfw.module.basic.common.api.query.StringSearchConfigTo;

/**
 * {@link SearchCriteriaTo} to find instances of
 * {@link com.devonfw.application.jtqj.calendarmanagement.common.api.Calendar}s.
 */
public class CalendarSearchCriteriaTo extends AbstractSearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private String name;

  private Integer _year;

  private Integer _month;

  private Integer days_number;

  private Integer yearmonth;

  private Long centerId;

  private StringSearchConfigTo nameOption;

  /**
   * @return nameId
   */

  public String getName() {

    return name;
  }

  /**
   * @param name setter for name attribute
   */

  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return _yearId
   */

  public Integer get_year() {

    return _year;
  }

  /**
   * @param _year setter for _year attribute
   */

  public void set_year(Integer _year) {

    this._year = _year;
  }

  /**
   * @return _monthId
   */

  public Integer get_month() {

    return _month;
  }

  /**
   * @param _month setter for _month attribute
   */

  public void set_month(Integer _month) {

    this._month = _month;
  }

  /**
   * @return days_numberId
   */

  public Integer getDays_number() {

    return days_number;
  }

  /**
   * @param days_number setter for days_number attribute
   */

  public void setDays_number(Integer days_number) {

    this.days_number = days_number;
  }

  /**
   * @return yearmonthId
   */

  public Integer getYearmonth() {

    return yearmonth;
  }

  /**
   * @param yearmonth setter for yearmonth attribute
   */

  public void setYearmonth(Integer yearmonth) {

    this.yearmonth = yearmonth;
  }

  /**
   * getter for centerId attribute
   * 
   * @return centerId
   */

  public Long getCenterId() {

    return centerId;
  }

  /**
   * @param center setter for center attribute
   */

  public void setCenterId(Long centerId) {

    this.centerId = centerId;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getName() name}.
   */
  public StringSearchConfigTo getNameOption() {

    return this.nameOption;
  }

  /**
   * @param nameOption new value of {@link #getNameOption()}.
   */
  public void setNameOption(StringSearchConfigTo nameOption) {

    this.nameOption = nameOption;
  }

}
