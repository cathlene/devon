package com.devonfw.application.jtqj.peoplecentermanagement.dataacces.api;

import java.sql.Timestamp;

import com.devonfw.application.jtqj.centermanagement.dataaccess.api.CenterEntity;
import com.devonfw.application.jtqj.peoplemanagement.dataaccess.api.PeopleEntity;

/**
 * @author cvanmoor
 *
 */
public class PeopleCenterEntity {

  private PeopleEntity people;

  private CenterEntity center;

  private Timestamp start_date;

  private Timestamp end_date;

  /**
   * @return people
   */
  public PeopleEntity getPeople() {

    return this.people;
  }

  /**
   * @param people new value of {@link #getpeople}.
   */
  public void setPeople(PeopleEntity people) {

    this.people = people;
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
   * @return start_date
   */
  public Timestamp getStart_date() {

    return this.start_date;
  }

  /**
   * @param start_date new value of {@link #getstart_date}.
   */
  public void setStart_date(Timestamp start_date) {

    this.start_date = start_date;
  }

  /**
   * @return end_date
   */
  public Timestamp getEnd_date() {

    return this.end_date;
  }

  /**
   * @param end_date new value of {@link #getend_date}.
   */
  public void setEnd_date(Timestamp end_date) {

    this.end_date = end_date;
  }

}
