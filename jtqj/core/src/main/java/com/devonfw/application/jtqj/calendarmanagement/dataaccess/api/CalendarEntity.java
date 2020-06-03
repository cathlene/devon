package com.devonfw.application.jtqj.calendarmanagement.dataaccess.api;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.devonfw.application.jtqj.calendarmanagement.common.api.Calendar;
import com.devonfw.application.jtqj.centermanagement.dataaccess.api.CenterEntity;
import com.devonfw.application.jtqj.general.dataaccess.api.ApplicationPersistenceEntity;

/**
 * @author cvanmoor
 */
@Entity
@Table(name = "Calendar")
public class CalendarEntity extends ApplicationPersistenceEntity implements Calendar {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id_calendar")
  private Long id;

  private String name;

  private Integer _year;

  private Integer _month;

  private Integer days_number;

  private Integer yearmonth;

  @OneToOne
  @JoinColumn(name = "id_center")
  private CenterEntity center;

  private static final long serialVersionUID = 1L;

  /**
   * @return name
   */
  @Override
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  @Override
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return _year
   */
  @Override
  public Integer get_year() {

    return this._year;
  }

  /**
   * @param _year new value of {@link #get_year}.
   */
  @Override
  public void set_year(Integer _year) {

    this._year = _year;
  }

  /**
   * @return _month
   */
  @Override
  public Integer get_month() {

    return this._month;
  }

  /**
   * @param _month new value of {@link #get_month}.
   */
  @Override
  public void set_month(Integer _month) {

    this._month = _month;
  }

  /**
   * @return days_number
   */
  @Override
  public Integer getDays_number() {

    return this.days_number;
  }

  /**
   * @param days_number new value of {@link #getdays_number}.
   */
  @Override
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

  /**
   * @return yearmonth
   */
  @Override
  public Integer getYearmonth() {

    return this.yearmonth;
  }

  /**
   * @param yearmonth new value of {@link #getyearmonth}.
   */
  @Override
  public void setYearmonth(Integer yearmonth) {

    this.yearmonth = yearmonth;
  }

  @Override
  @Transient
  public Long getCenterId() {

    if (this.center == null) {
      return null;
    }
    return this.center.getId();
  }

  @Override
  public void setCenterId(Long centerId) {

    if (centerId == null) {
      this.center = null;
    } else {
      CenterEntity centerEntity = new CenterEntity();
      centerEntity.setId(centerId);
      this.center = centerEntity;
    }
  }

  @Override
  public Long getId() {

    // TODO Auto-generated method stub
    return this.id;
  }

  @Override
  public void setId(Long id) {

    this.id = id;

  }

}
