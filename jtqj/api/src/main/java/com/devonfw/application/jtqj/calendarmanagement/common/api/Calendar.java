package com.devonfw.application.jtqj.calendarmanagement.common.api;

import com.devonfw.application.jtqj.general.common.api.ApplicationEntity;

public interface Calendar extends ApplicationEntity {

  /**
   * @return nameId
   */

  public String getName();

  /**
   * @param name setter for name attribute
   */

  public void setName(String name);

  /**
   * @return _yearId
   */

  public Integer get_year();

  /**
   * @param _year setter for _year attribute
   */

  public void set_year(Integer _year);

  /**
   * @return _monthId
   */

  public Integer get_month();

  /**
   * @param _month setter for _month attribute
   */

  public void set_month(Integer _month);

  /**
   * @return days_numberId
   */

  public Integer getDays_number();

  /**
   * @param days_number setter for days_number attribute
   */

  public void setDays_number(Integer days_number);

  /**
   * @return yearmonthId
   */

  public Integer getYearmonth();

  /**
   * @param yearmonth setter for yearmonth attribute
   */

  public void setYearmonth(Integer yearmonth);

  /**
   * getter for centerId attribute
   * 
   * @return centerId
   */

  public Long getCenterId();

  /**
   * @param center setter for center attribute
   */

  public void setCenterId(Long centerId);

}
