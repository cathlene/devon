package com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to;

import java.sql.Timestamp;

import com.devonfw.application.jtqj.general.common.api.to.AbstractSearchCriteriaTo;

/**
 * {@link SearchCriteriaTo} to find instances of
 * {@link com.devonfw.application.jtqj.peoplecentermanagement.common.api.PeopleCenter}s.
 */
public class PeopleCenterSearchCriteriaTo extends AbstractSearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private Long peopleId;

  private Long centerId;

  private Timestamp start_date;

  private Timestamp end_date;

  /**
   * getter for peopleId attribute
   *
   * @return peopleId
   */

  public Long getPeopleId() {

    return this.peopleId;
  }

  /**
   * @param people setter for people attribute
   */

  public void setPeopleId(Long peopleId) {

    this.peopleId = peopleId;
  }

  /**
   * getter for centerId attribute
   *
   * @return centerId
   */

  public Long getCenterId() {

    return this.centerId;
  }

  /**
   * @param center setter for center attribute
   */

  public void setCenterId(Long centerId) {

    this.centerId = centerId;
  }

  /**
   * @return start_dateId
   */

  public Timestamp getStart_date() {

    return this.start_date;
  }

  /**
   * @param start_date setter for start_date attribute
   */

  public void setStart_date(Timestamp start_date) {

    this.start_date = start_date;
  }

  /**
   * @return end_dateId
   */

  public Timestamp getEnd_date() {

    return this.end_date;
  }

  /**
   * @param end_date setter for end_date attribute
   */

  public void setEnd_date(Timestamp end_date) {

    this.end_date = end_date;
  }

}
