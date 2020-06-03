package com.devonfw.application.jtqj.calendarmanagement.dataaccess.api;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.devonfw.application.jtqj.centermanagement.dataaccess.api.CenterEntity;

/**
 * @author cvanmoor
 *
 */
@Entity
@Table(name = "Calendar")
public class CalendarEntity {

  private String name;

  private Integer _year;

  private Integer _month;

  private Integer days_number;

  @OneToOne
  @JoinColumn(name = "id_center")
  private CenterEntity center;

  /**
   * @return name
   */
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return _year
   */
  public Integer get_year() {

    return this._year;
  }

  /**
   * @param _year new value of {@link #get_year}.
   */
  public void set_year(Integer _year) {

    this._year = _year;
  }

  /**
   * @return _month
   */
  public Integer get_month() {

    return this._month;
  }

  /**
   * @param _month new value of {@link #get_month}.
   */
  public void set_month(Integer _month) {

    this._month = _month;
  }

  /**
   * @return days_number
   */
  public Integer getDays_number() {

    return this.days_number;
  }

  /**
   * @param days_number new value of {@link #getdays_number}.
   */
  public void setDays_number(Integer days_number) {

    this.days_number = days_number;
  }

  /**
   * @return center
   */
  public CenterEntity getCenter() {

    return this.center;
  }

  /**
   * @param center new value of {@link #getcenter}.
   */
  public void setCenter(CenterEntity center) {

    this.center = center;
  }

}
